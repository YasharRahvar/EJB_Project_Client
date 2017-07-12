# EJB_Project_Client

This is a Client for EJB Project.It includes JSP pages, images, servlets and filters.

## Deployment
You can simply create a war file and drop it into webserver deylopment folder and run the server.
Important Notes: 
1. Because we are using EJB technology you need to have powerful web server like JBoss to be able to run the application.
2. This web application has been set up to work on my personal MySql database. In order for you to run the application you need to 
   download the EJB_Project_Services project and change the connention pooling configuration in the persistence.xml file to your database.
3. You also need to create a table 'employee'in your database which has field names as follow: [id][varchar](9),[firstName][varchar](250),
[lastName][varchar](250),[date][date]
4. Last step is to deploy the EJB_Project_Services which creates a jar file. Remove the old jar file which is in the lib folder in
   EJB_Project_Client and copy the new jar file in there and add it build path.
5. You need to create two users and roles in your web server in order to be able to login to the application.
user: user  user: admin
role: user  role: admin

   
## Built With
Maven

## Author
Yashar Rahvar

