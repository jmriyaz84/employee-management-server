# Employee Management Server 

Employee Management Server is a microservice which is developed by using Spring Boot ,Spring MVC ,  Spring Data JPA , Hibernate, Project Lombok ,  MySql , Embedded Tomcat Server & Rest API.

It does the basic CRUD operations & exposed by using Rest API .

### To get the Code
```
git clone git@github.com:jmriyaz84/employee-management-server.git
```

### Build Project
```
mvn clean install
```
### Run Project
```
mvn spring-boot:run
```


## Rest API Details

### Get Employees

```
URL : http://localhost:8080/employees
```


### Add Employee

```
URL : http://localhost:8080/addEmployee
 
Request : 
{
    "firstName": "Imran",
    "lastName": "Malik",
    "dateOfBirth": "24-Apr-1980",
    "age": 40,
    "salary": 30000,
    "dateOfJoin": "20-May-2010",
    "yearOfExperience": 10,
    "reportingManager": "William Brown",
    "address": "Al Nahda",
    "city": "Lahore",
    "country": "Pakistan"
}
```


### Get Employee by Id
``` 
URL : http://localhost:8080/employee/7
```

### Get Employee by Name
```
URL : http://localhost:8080/employees/Robert
```

### Update Employee

```
URL : http://localhost:8080/employee/5

Request

{
    "firstName": "Robert",
    "lastName": "Bush",
    "dateOfBirth": "24-Apr-1980",
    "age": 35,
    "salary": 30000,
    "dateOfJoin": "20-May-2010",
    "yearOfExperience": 20,
    "reportingManager": "William Gate",
    "address": "Al Nahda",
    "city": "London",
    "country": "UK"
}
	
```

### Delete Employee

```
URL : http://localhost:8080/employee/5

```



