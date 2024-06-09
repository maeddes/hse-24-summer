FROM golang:1.22.4

WORKDIR /app
COPY go.mod go.sum ./
RUN go mod download

COPY . .

RUN go build -o main .
EXPOSE 8080

CMD ["./main"]