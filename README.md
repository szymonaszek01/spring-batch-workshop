## The purpose of the application is to move data from one database (db-read) to another (db-write) using Spring Batch. Databases are hosted on https://render.com.

### Description:
Firstly, we want to divide table ("medical_appointments") in "db-read" into smaller tables ("users" and "medical_appointments") and save this new database schema in "db-write".
Then, we create a cron job, which transfer data from "db-read" to "db-write" at 6:00 every day.

### Database (db-read):
* PostgreSQL
* Readonly

### Database (db-write):
* PostgreSQL
* Read and Write

### Tech Stack:
* Spring Boot
* Spring Batch
* Liquibase

## Project description:
### 1) Package "db"
Contains configuration files which define:
* DataSource
* EntityManager and JPA Properties
* Liquibase

Using two databases simultaneously requires separate configurations, so I could not define it in application.yml as usual.

### 2) Package "dictionary"
Contains enums and converters.

### 3) Package "entity"
Entities (db-read):
* MedicalAppointment.java

Entities (db-write):
* BaseEntity.java
* User.java extends BaseEntity.java
* MedicalAppointment.java extends BaseEntity.java
