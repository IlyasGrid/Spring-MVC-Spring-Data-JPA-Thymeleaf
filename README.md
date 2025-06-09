# Patient Manager

## Project Structure

```
patient_manger/
├── src/
│   ├── main/
│   │   ├── java/enset/ilyasgrid/patient_manger/
│   │   │   ├── entities/
│   │   │   ├── respository/
│   │   │   ├── web/
│   │   │   └── PatientMangerApplication.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   └── patient.html
│   │       └── application.properties
│   └── test/
│       └── java/enset/ilyasgrid/patient_manger/
│           └── PatientMangerApplicationTests.java
├── pom.xml
└── ...
```

## Technologies Used

- **Java 17**
- **Spring Boot 3.4.3**
  - Spring Data JPA
  - Spring Web
  - Spring Boot DevTools
  - Spring Boot Starter Test
- **Thymeleaf** (for server-side HTML rendering)
- **H2 Database** (in-memory, for development/testing)
- **Lombok** (for reducing boilerplate code)
- **Bootstrap 5** (for UI styling, via WebJars)

## Workflow

1. **Startup**:  
   The application starts with [`PatientMangerApplication`](src/main/java/enset/ilyasgrid/patient_manger/PatientMangerApplication.java), which seeds the database with sample patients.

2. **Data Layer**:

   - The [`Patient`](src/main/java/enset/ilyasgrid/patient_manger/entities/Patient.java) entity represents a patient.
   - The [`PatientRepository`](src/main/java/enset/ilyasgrid/patient_manger/respository/PatientRepository.java) interface provides CRUD operations.

3. **Web Layer**:

   - The [`PatientController`](src/main/java/enset/ilyasgrid/patient_manger/web/PatientController.java) handles HTTP requests and passes data to Thymeleaf templates.

4. **Views**:

   - HTML templates in [`src/main/resources/templates/`](src/main/resources/templates/) display patient data using Thymeleaf.

5. **Testing**:
   - Basic context loading test in [`PatientMangerApplicationTests`](src/test/java/enset/ilyasgrid/patient_manger/PatientMangerApplicationTests.java).

## Features

- List all patients
- Add sample patients on startup
- View patient details in a styled table

---

_This project is a simple Spring Boot CRUD application for managing patients, using modern Java and web technologies._
