# spring-boot-kafka-demo

## This is working
```shell
$ docker-compose up -d
$ ./mvnw spring-boot:run
```

## This is NOT working
```shell
$ ./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=sivaprasadreddy/spring-boot-kafka-demo
$ docker-compose -f docker-compose-with-app.yaml up
```
