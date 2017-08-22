# Finatra-slick

A simple rest service that uses:

- Finatra (Web service framework)
- Slick (Relational mapping library)
- Flyway (Database migration tool)
- Postgres (Database)

## About the service

A simple service to do basic crud operations on postgres database using slick.
It uses Flyway to manage the database migrations.
The service is built using Finatra which also exposes some inbuilt metrics which can be helpful.

## Run Locally

```
sbt flywayMigrate
sbt run
```

Services run on port ```8080```

The twitter server metrics can be accessed at ```<HOST>:9990/admin```

## Things covered

- Restful API
- Database Integration using slick
- Finatra as the web service framework
- Easy migration of database using Flyway