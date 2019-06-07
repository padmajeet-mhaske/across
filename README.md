# across

# 33Across Example

This application is trying to build Ad Enhancer around existing request. 
Given request would be populated with extra parameters like demographics, Publiser and device info.

This is REST based microservice implementation where give JSON will be enhanced with more information

## Getting Started

Clone this repository to get started.

### Prerequisites

You need maven up and running to run this project. 

```
Apache Maven 3.0.5
Java version: 1.8
```

### Installing

A step by step series of examples that tell you how to get a development env running

As a first step clone this repo.

```
git clone https://github.com/padmajeet-mhaske/across.git
```

Change to checked out directory 
```
cd across
```

Run maven command below to install and run application 
```
mvn clean install tomcat7:run
```

Open Swagger UI to test API running 

```
http://localhost:9090/swagger-ui.html
```

You can also directly open API in swagger and test POST and GET requestfor demo.

### Challenges

Demographic servicecn block your IP address and after that ADEnhancer will put only null values for those variables.
```

```
