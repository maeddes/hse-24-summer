#!/bin/bash

#EOF allows for multiline commands
#mongosh is needed to hop into the mongo shell where these commands need to be executed
#-----create superuser-----#
mongosh <<EOF
use admin
db.CreateUser({
    user: "superuser",
    pwd: "superuser",
    roles: [{role: "root", db: "admin"}]
})
EOF

#-----create some master data as superuser if it doesnt already exist-----#
mongosh -u superuser -p superuser --authenticationDatabase admin <<EOF
use todo_db
if(db.getCollectionNames().indexOf('todos') == -1 || db.todos.countDocuments() == 0) {
    db.createCollection('todos')
    db.todos.insertMany([
        {task: "sleep"},
        {task: "snooze"},
        {task: "slumber"}
    ])
}
EOF