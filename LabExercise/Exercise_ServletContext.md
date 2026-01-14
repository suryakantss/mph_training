##### Exercise : Student Management System

##### Objective

##### Create a simple student management system using ServletConfig and

##### ServletContext.

##### Requirements

##### 1\. Global Settings (ServletContext):

#####  Store in web.xml:

##### o institute.name (e.g., "ABC College")

##### o max.students (e.g., "100")

##### o admin.email (e.g., "admin@college.com")

##### 2\. Department-Specific Settings (ServletConfig):

#####  Create 2 servlets with different configs in web.xml:

##### o ComputerServlet (Computer Department):

#####  hod.name: "Dr. Smith"

#####  total.courses: "12"

##### o MathServlet (Math Department):

#####  hod.name: "Dr. Johnson"

#####  total.courses: "8"

##### 3\. Tasks:

#####  When you access ComputerServlet, show:

##### ABC College (Global Setting)

##### Department: Computer Science

##### HOD: Dr. Smith

##### Courses: 12

##### Max Students Allowed: 100

#####  When you access MathServlet, show:

##### ABC College (Global Setting)

##### Department: Mathematics

##### HOD: Dr. Johnson

##### Courses: 8

##### Max Students Allowed: 100

##### Key Points:

#####  Institute name is shared (all departments see same)

#####  HOD name is different for each department

#####  Max students is shared from context 

