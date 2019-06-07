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

You can now directly open API in swagger and test POST and GET requests for demo.

### API

There are two end points published under Ad Controller (ad-controller). 
## 1. Demo
demo is POST method to send json data to server using body tag. based on request Demographics, Country code etc will be populated.

```
curl -X POST "http://localhost:9090/ad/demo" -H "accept: */*" -H "Content-Type: application/json" -d "{\"site\": {\"id\": \"foo123\",\"page\": \"http://www.foo.com/why-foo\"},\"device\": {\"ip\": \"69.250.196.118\"},\"user\": {\"id\": \"9cb89r\"}}"
```

For above query out should look like below:
```
{
  "site": {
    "id": "foo123",
    "page": "http://www.foo.com/why-foo",
    "demographics": null,
    "publisher": null
  },
  "device": {
    "ip": "69.250.196.118",
    "geo": {
      "country": "US"
    },
    "country_code": null
  },
  "user": {
    "id": "9cb89r"
  }
}
```
As on my PC demograpis and publisher API is blocked I got null reply however for Geo API country "US" has been populated and this happened with in 

## 2. Demo2

This is simpler version of above query with GET method where dummy values would be populated on server and prepared JSON would be returned.

### Challenges

Demographic service can block your IP address and after that ADEnhancer will put only null values for demographics and publisher variables.

