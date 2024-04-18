# Contract Info API setup Guide

### Contents
    1) Environment Prerequisities
    2) Building/Running Locally in IDE

### Environment Prerequisities
    1) JAVA 17 
    2) Spring Boot-Rest API
    3) Junit
    4) Maven

### Building/Running Locally in IDE
* Clone the project from git repo
* build the project by running command mvn clean install
* To run the application locally in IDE select/right click on:
    1) /contarctinfo/src/main/java/com/oracle/contarctinfo/ContarctinfoApplication.java
    2) Select "Run"->Run as "Java Application"
* To test the stratup of your locally running application using browser navigate to the followig URL's
  http://localhost:8080/contractinfo/healthcheck
* To test the problem statement solution run the below URL:
  * Get API INPUT URL-> http://localhost:8080/contractinfo/retrivecontractinfo?input=2343225,2345,us_east,RedTeam,ProjectApple,3445s
  1223456,2345,us_west,BlueTeam,ProjectBanana,2211s
  3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s
  1233456,2345,us_west,BlueTeam,ProjectDate,2221s
  3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s
  * OUTPUT-> [
  "Number of unique customerId for each contractId:--2346: 2--2345: 3",
  "Number of unique customerId for each geozone:--eu_west: 2--us_west: 2--us_east: 1",
  "Average buildduration for each geozone:--eu_west: 4222.0--us_west: 2216.0--us_east: 3445.0",
  "List of unique customerId for each geozone:--eu_west: [3244132, 3244332]--us_west: [1233456, 1223456]--us_east: [2343225]"
  ]