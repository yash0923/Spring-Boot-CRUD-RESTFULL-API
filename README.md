# Spring-Boot-CRUD-RESTFULL-API
Spring Boot CRUD RESTFULL API

Create a Database :- company

Run on java application

Open postman

this project run on  http://localhost:8080/hroperations/employee


1.)  To save the employee (use method post)( choose the method post in postman)

      http://localhost:8080/hroperations/employee/save

      {
	      "name" :"Uday",
	      "salary" : 400000000
      }
      
2.)  To retrieve all the record (use method get)( choose the method post in postman)

    http://localhost:8080/hroperations/employee/all/
    
3.) To retrieve the single record (use get method)( choose the method get in postman)

    http://localhost:8080/hroperations/employee/{id}              eg (1 or 2 or 3 etc........)
    
4.) To update the record (use put method) ( choose the method put in postman)

     http://localhost:8080/hroperations/employee/update
     
     {
         "id": 9,
         "name": "User112",
         "salary": 450000
     }
     
 5.) To delete the data from the database(use delete method)(chhose delete from postman)
 
      http://localhost:8080/hroperations/employee/{id}              eg (1 or 2 or 3 etc........)

    
  
