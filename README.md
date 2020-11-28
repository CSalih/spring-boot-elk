# Spring Boot with ELK
Example with Spring Boot to log into Logstash.

## Setup

Start your ELK Stack, this example will send the log file via TCP (Port 5000) 
to Logstash. You can also https://github.com/CSalih/elk-docker-stack witch is 
preconfigured for this example.

```bash
$ ./gradlew bootRun
```

Send a GET Request to `http://localhost:8080/log/{message}`.  
Now you can go to the [Kibana UI](http://localhost:5601) and configure an index for 
`logback-tcp-*`. You can Visualize your logs for more read the documentation of Kibana.