# Product API

This is a Java project that implements a Product API using Spring Boot, Spring Data JPA, and Spring MVC. The API allows you to retrieve product details, including image URL, product name, price, stock availability, and other relevant details. It also supports pagination with defaulting to page 1 and a configurable number of product entries per page (defaulting to 15 with a maximum of 30).

## Project Structure

The project has the following directory structure:

```
my-product-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── productapi
│   │   │               ├── Application.java
│   │   │               ├── controller
│   │   │               │   └── ProductController.java
│   │   │               ├── model
│   │   │               │   └── Product.java
│   │   │               └── repository
│   │   │                   └── ProductRepository.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── productapi
├── build.gradle
├── settings.gradle
└── README.md
```

## Project Files

- `src/main/java/com/example/productapi/Application.java`: This file is the entry point of the Spring Boot application. It contains the main method to start the application.

- `src/main/java/com/example/productapi/controller/ProductController.java`: This file is a Spring MVC controller that handles the HTTP requests for the Product API. It contains methods to retrieve product details, including image URL, product name, price, stock availability, and other relevant details. It also supports pagination with defaulting to page 1 and a configurable number of product entries per page (defaulting to 15 with a maximum of 30).

- `src/main/java/com/example/productapi/model/Product.java`: This file defines the `Product` class, which represents a product entity in the application. It contains properties such as image URL, product name, price, stock availability, and other relevant details.

- `src/main/java/com/example/productapi/repository/ProductRepository.java`: This file defines the `ProductRepository` interface, which extends the Spring Data JPA `CrudRepository`. It provides methods for querying and manipulating product data in the database.

- `src/main/resources/application.properties`: This file contains the configuration properties for the Spring Boot application, such as the database connection details.

- `src/test/java/com/example/productapi`: This directory is for placing test files for the project. It can contain test classes and packages to test the functionality of the application.

- `build.gradle`: This file is the build configuration file for Gradle. It defines the project dependencies, plugins, and build tasks.

- `settings.gradle`: This file is the settings file for Gradle. It includes the modules or sub-projects that are part of the project.

## Getting Started

To set up and run the Product API, follow these steps:

1. Clone the repository to your local machine.

2. Open the project in your preferred Java IDE.

3. Configure the database connection details in the `application.properties` file located in the `src/main/resources` directory.

4. Build the project using Gradle.

5. Run the `Application.java` file to start the Spring Boot application.

6. The Product API will be accessible at `http://localhost:8080/api/products`.

## API Endpoints

The following endpoints are available in the Product API:

- `GET /api/products`: Retrieves a list of products with pagination support. The default page is 1, and the default number of product entries per page is 15 (maximum 30).

- `GET /api/products/{id}`: Retrieves a specific product by its ID.

- `POST /api/products`: Creates a new product.

- `PUT /api/products/{id}`: Updates an existing product.

- `DELETE /api/products/{id}`: Deletes a product.

Please refer to the `ProductController.java` file for more details on the API endpoints and their usage.

## Testing

The project includes a `test` directory where you can place your test classes and packages to test the functionality of the application. You can use testing frameworks such as JUnit or Mockito to write your tests.

## Dependencies

The project uses the following dependencies:

- Spring Boot: Provides the framework for building the application.

- Spring Data JPA: Simplifies the interaction with the database.

- Spring MVC: Handles the HTTP requests and responses.

Please refer to the `build.gradle` file for the complete list of dependencies used in the project.

## Contributing

Contributions to the project are welcome. If you find any issues or have suggestions for improvement, please create a new issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).