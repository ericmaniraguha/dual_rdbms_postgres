# Spring Boot Multi-Database Application

This is a sample Spring Boot application that demonstrates how to connect to two different RDBMS databases (H2 and PostgreSQL) using Spring Data JPA. The application includes services, controllers, repositories, and configuration for properties.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 8 or higher is installed.
- Maven is installed.
- PostgreSQL is set up with a database named `your_postgres_db` and appropriate credentials.
- [Optional] An IDE (such as IntelliJ IDEA or Eclipse) for easier development.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/your-username/spring-boot-multi-db.git

2. Run tha apps:

cd spring-boot-multi-db
mvn spring-boot:run

## Accessing the H2 Console

To access the H2 Console, follow these steps:

1. Open your web browser and navigate to: [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

2. Use the following settings to log in:
   - JDBC URL: `jdbc:h2:mem:logs_db`
   - User Name: `sa`
   - Password: (leave blank)

## Interacting with the Application

To interact with the application, you can perform the following actions:

- To retrieve logs from the H2 database, visit: [http://localhost:8080/logs/h2](http://localhost:8080/logs/h2).

- To retrieve logs from the PostgreSQL database, visit: [http://localhost:8080/logs/postgres](http://localhost:8080/logs/postgres).

## Configuration

The application's database configurations are located in the `src/main/resources/application.properties` file. You can modify these settings to suit your environment.

```properties
# H2 Database Configuration
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:logs_db
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

# PostgreSQL Database Configuration
spring.datasource.secondary.url=jdbc:postgresql://localhost:5432/my_redbms
spring.datasource.secondary.username=your_postgres_username
spring.datasource.secondary.password=your_postgres_password
spring.datasource.secondary.driver-class-name=org.postgresql.Driver

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update



