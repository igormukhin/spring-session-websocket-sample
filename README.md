spring-session-websocket-sample
================================

The sample is originated from the [Spring Session](https://github.com/spring-projects/spring-session) project.
Original location inside the Spring Session repository is `/samples/websocket`.

### Differences

* Stand-alone Maven project
* Dependency to Redis is replaces with a simple Map as storage for session data

### Usage

Run with

    mvn spring-boot:run

For available logins see `/src/main/resources/data.sql`.

### Read more

* [Spring Session - WebSocket documentation](http://docs.spring.io/spring-session/docs/current-SNAPSHOT/reference/html5/guides/websocket.html)
* [About this sample](http://docs.spring.io/spring-session/docs/current-SNAPSHOT/reference/html5/guides/websocket.html#websocket-sample)
