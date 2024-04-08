# 2023-March-11 Cloud and Semester Introduction

## Initial Brainstorming Session - Technologies and Motivators for Distributed Systems

![Brainstorming](/pics/2024-03-11-DistributedSystemsBrainstorm.png)

### Content

* Why distributed systems, why container, why modern software?
* What is Cloud Computing? Encounters in everyday life and history
* Characteristic, advantages & challenges
* Terminology - public, private, hybrid, dedicated
* Abstraction layers - IaaS, PaaS, FaaS, SaaS
* Overview - Hypervisors, virtual machines, containers and orchestration

### Objectives and exercises
_The student is able to describe the reasons for distributed systems and
cloud computing in own words and list examples for offerings, topologies and technologies. Includes ability to differentiate between different abstraction layers and knowledge how those layers and according technologies interact with each other. No exercises in this module_

### Student Questions

* What is Polyglot Software Development?
* What did the role of containers change for polyglot software?
* Security and Cloud - is it safe? :-)

![Polyglot Container](/pics/2024-03-11-ContainerVsTraditional.png)

### Outlook for Labs

* Distributed app
* Polyglot implementation
* Containerisation
* Kubernetes
* DevOps/CICD/Observability (optional)

![Exercise Tech Stack](/pics/2024-03-11-Blackboard.jpg)

### Homework

* Get a public GitHub, GitLab or Bitbucket account
* Play around with GitHub codespaces and/or Gitpod
  
# 2023-March-18 Session canceled

# 2023-March-25 Cloud-based IDEs Intro & Docker/Container

### Content 
* Why do we need Containers?
* Challenges for (polyglot) distributed systems in traditional IT:

  * Each environment has to be configured manually: Servers as well as local dev environments
  * Configuration has to be as identical as possible: minor configuration drifts can lead to errors and the "it runs on my machine" problem
  * Polyglot Server Environments are a huge challenge as for each programing language a separate configuration has to be managed on all systems.
  * Changing Versions is tedious for local dev environment

  ![image](https://github.com/maeddes/hse-24-summer/assets/22505258/63a76e4b-cd0e-4f9d-8e6e-cb7b364d4581)

  * Whereas containerized Applications bring their own Environment and Configuration
  * No need to preconfigure the local environment per programming language or application.
  * Only the container engine is required to run all kinds of containers.
    
 ![image](https://github.com/maeddes/hse-24-summer/assets/22505258/35dfe922-1c43-46db-a419-4c602dd084dc)

 * How does the container engine work?
 * Layer-based setup of containers
 * Container vs Container Image
 * How to create a container from application to dockerfile to image to running container

  ![image](https://github.com/maeddes/hse-24-summer/assets/22505258/bcad4374-da59-429a-8272-1b42642c888c)

### Student Questions:
* Do I have to set up, build, and run the dockerfile  for each container?
* Can I run multiple applications inside a container?

### Labs
Exercises can be found [here](https://lecture.new.trainings.nvtc.io/basics/container/)
