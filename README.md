# time-interval-analyzer

This project uses Java 8 and Spring Boot Java Framework.

## Running the application
```shell script
./mvnw spring-boot:run
```

Application will run on http://localhost:8080.

Example request unassigned time intervals
```
GET /api/unassigned-intervals
```
with xml file in body.


Example response
Status code 200
```json
[
    {
        "startDate": "2015-01-20 01:00:00",
        "endDate": "2015-01-20 03:00:00"
    }
]
```
