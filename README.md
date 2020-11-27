# Spring Boot with ELK
Example with Spring Boot to log into Logstash.

## Setup

```bash
$ docker-compose up -d
$ ./gradlew bootRun
```

Send a GET Request to `http://localhost:8080/log/{message}`. 
Now you can go to the [Kibana UI](http://localhost:5601) and configure an index for 
`logback-tcp-*`. You can Visualize your logs for more read the documentation of Kibana.