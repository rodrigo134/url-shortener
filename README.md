<div align="center">
  <h1>🔗 URL Shortener</h1>
  <p>A high-performance URL shortening service built with Spring Boot and MongoDB</p>
  
  [![Java Version](https://img.shields.io/badge/Java-17%2B-orange?logo=java)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
  [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen?logo=spring)](https://spring.io/projects/spring-boot)
  [![MongoDB](https://img.shields.io/badge/MongoDB-6.0%2B-47A248?logo=mongodb&logoColor=white)](https://www.mongodb.com/)
  [![Docker](https://img.shields.io/badge/Docker-3.9-2496ED?logo=docker&logoColor=white)](https://www.docker.com/)
  [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
</div>

## ✨ Features

- 🚀 **Lightning Fast** - Quick URL shortening and redirection
- 🔒 **Secure** - Built with security best practices
- 📱 **RESTful API** - Easy integration with any client
- 🐳 **Docker Support** - Containerized deployment ready
- 📊 **MongoDB Backend** - Scalable NoSQL storage
- ⚡ **Minimal Dependencies** - Lightweight and efficient

## 🚀 Quick Start

### Prerequisites

- Java 17 or later
- Maven 3.6+
- MongoDB 6.0+ (or Docker)
- Docker (optional)

### Local Development

1. **Clone the repository**
   ```bash
   git clone https://github.com/rodrigo134/urlshortener.git
   cd urlshortener
   ```

2. **Configure Environment**
   Create a `.env` file in the root directory:
   ```env
   # Application
   SPRING_APPLICATION_NAME=urlshortener
   
   # MongoDB Configuration
   SPRING_DATA_MONGODB_HOST=localhost
   SPRING_DATA_MONGODB_PORT=27017
   SPRING_DATA_MONGODB_DATABASE=urlshortener
   SPRING_DATA_MONGODB_USERNAME=
   SPRING_DATA_MONGODB_PASSWORD=
   SPRING_DATA_MONGODB_AUTHENTICATION_DATABASE=admin
   SPRING_DATA_MONGODB_AUTO_INDEX_CREATION=true
   ```

3. **Run with Maven**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Or run with Docker**
   ```bash
   docker-compose -f docker/docker-compose.yml up --build
   ```

The application will be available at: http://localhost:8080

## 📚 API Documentation

### Base URL
```
http://localhost:8080
```

### 1. Create Short URL

**Endpoint**
```
POST /shorten-url
```

**Request**
```http
POST /shorten-url
Content-Type: application/json

{
    "url": "https://example.com/very/long/url/to/be/shortened"
}
```

**Response**
```json
{
    "url": "http://localhost:8080/abc123"
}
```

### 2. Redirect to Original URL

**Endpoint**
```
GET /{shortId}
```

**Response**
- `302 Found`: Redirects to the original URL
- `404 Not Found`: If the short URL doesn't exist

## 🏗️ Project Structure

```
urlshortener/
├── src/
│   └── main/
│       ├── java/com/rodrigo134/urlshortener/
│       │   ├── config/        # Configuration classes
│       │   ├── controller/    # REST endpoints
│       │   ├── dto/           # Data Transfer Objects
│       │   ├── entities/      # Domain models
│       │   └── repository/    # Data access layer
│       └── resources/         # Config files and static resources
├── docker/                    # Docker configuration
├── .gitignore
├── pom.xml
└── README.md
```

## 🛠️ Development

### Building the Project
```bash
./mvnw clean package
```

### Running Tests
```bash
./mvnw test
```

### Code Formatting
```bash
./mvnw spotless:apply
```

## 🤝 Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

## 🙏 Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [MongoDB](https://www.mongodb.com/) - NoSQL database
- [Docker](https://www.docker.com/) - Container platform
- [Maven](https://maven.apache.org/) - Dependency Management

---

<div align="center">
  Made with ❤️ by Rodrigo
</div>
