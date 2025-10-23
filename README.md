# URL Shortener

A simple and efficient URL shortener service built with Spring Boot and MongoDB.

## Features

- Shorten long URLs to easy-to-share short links
- Automatic redirection from short URLs to original URLs
- Simple REST API for URL shortening
- Built with Spring Boot for robust backend operations
- MongoDB for persistent storage
- Docker support for easy deployment

## Prerequisites

- Java 17 or higher
- Maven
- MongoDB (local or remote)
- Docker (optional, for containerized deployment)

## Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/rodrigo134/urlshortener.git
cd urlshortener
```

### 2. Configure Environment Variables
Create a `.env` file in the root directory with the following variables:

```env
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

### 3. Build and Run

#### Using Maven:
```bash
./mvnw spring-boot:run
```

#### Using Docker Compose:
```bash
docker-compose -f docker/docker-compose.yml up --build
```

The application will be available at `http://localhost:8080`

## API Endpoints

### Shorten a URL

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

### Redirect to Original URL

**Request**
```http
GET /{shortId}
```

**Response**
- 302 Found: Redirects to the original URL
- 404 Not Found: If the short URL doesn't exist

## Project Structure

```
src/
├── main/
│   ├── java/com/rodrigo134/urlshortener/
│   │   ├── config/        # Configuration classes
│   │   ├── controller/    # REST controllers
│   │   ├── dto/           # Data Transfer Objects
│   │   ├── entities/      # Domain models
│   │   └── repository/    # Data access layer
│   └── resources/         # Application properties and static resources
docker/                     # Docker configuration
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Built with [Spring Boot](https://spring.io/projects/spring-boot)
- Data storage with [MongoDB](https://www.mongodb.com/)
- Containerization with [Docker](https://www.docker.com/)
