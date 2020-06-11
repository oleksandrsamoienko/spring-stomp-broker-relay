# Simple PoC how to handle websocket messages on multiple nodes.

## Technologies:
- Spring
- RabbitMQ
- JS 

## Run:
- `mvn clean:package`
- `docker-compose up`

## Mapping:
- node1: `localhost:8080`
- node2: `localhost:8081`
- node3: `localhost:8082`
- rabbitMQ: `localhost:15672` (`guest|guest`)

## Users:
- `user1 |  password`
- `user2 |  password`
- `user3 |  password`

## Demo

##### Open browser in `localhost:${node-port}`, login and connect to topic. 

##### In order to send message to target user name: ` curl -u user1:password http://localhost:8080/messages/target/user1`
##### Change nodes or users and check results.
