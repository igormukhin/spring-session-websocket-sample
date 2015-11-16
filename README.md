spring-session-websocket-sample
================================

The sample is originated from the [Spring Session](https://github.com/spring-projects/spring-session) project.
Original location inside the Spring Session repository is `/samples/websocket`.

### Differences

* Stand-alone Maven project
* Dependency to Redis is replaces with a simple Map as storage for session data
* Actuator is included to show that you may need to change its `/info` endpoint.

### Usage

Run with

    mvn spring-boot:run

For available logins see `/src/main/resources/data.sql`.

### Another useful samples

* [Portfolio](https://github.com/rstoyanchev/spring-websocket-portfolio) by rstoyanchev
* [Chat-Jc](https://github.com/spring-projects/spring-security/tree/master/samples/chat-jc) from Spring Security Samples (this is actually the same sample as this repo but older)

### Useful reads

* [Fine-grained subscription security](http://stackoverflow.com/a/21580515/404615)

### Documentation

* [Spring WebSocket documentation](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/websocket.html)
* [Spring Security WebSocket documentation](http://docs.spring.io/spring-security/site/docs/current/reference/html/websocket.html)
* [Spring Session WebSocket documentation](http://docs.spring.io/spring-session/docs/current-SNAPSHOT/reference/html5/guides/websocket.html)

