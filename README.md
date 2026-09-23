# Subscription Management Application

A Spring Boot-based web application designed to manage subscriptions, featuring a RESTful backend and a static frontend user interface.

---

## 🛠️ Tech Stack & Tools
* **Backend:** Java, Spring Boot (`SubscriptionApplication.java`)
* **Build Tool:** Apache Maven (`pom.xml`, `mvnw`)
* **Containerization:** Docker (`Dockerfile`, `compose.yml`)
* **Frontend:** HTML, JavaScript, CSS (`src/main/resources/static/`)

---

## 📁 Project Structure

```text
Subscription/
├── src/main/java/com/Iljazia/Subscription/
│   ├── controller/
│   │   └── SubscriptionController.java    # Handles HTTP requests & endpoints
│   ├── dao/
│   │   └── SubscriptionRepository.java    # Data access layer / repository
│   ├── Enum/
│   │   └── BillingCycle.java              # Billing cycle definitions (e.g., monthly, yearly)
│   ├── model/
│   │   └── Subscription.java              # Core subscription entity model
│   ├── service/
│   │   └── SubscriptionService.java       # Business logic layer
│   └── SubscriptionApplication.java       # Main Spring Boot entry point
├── src/main/resources/
│   ├── static/
│   │   ├── index.html                     # Frontend main page
│   │   ├── app.js                         # Frontend application logic
│   │   └── style.css                      # Application styling
│   └── application.properties             # Configuration settings
├── Dockerfile                             # Container image configuration
├── compose.yml                            # Docker Compose configuration
└── pom.xml                                # Maven project configuration
```

---

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK)
* Apache Maven (or use the included `./mvnw wrapper`)
* Docker & Docker Compose (optional, for containerized deployment)

### Running the Application Locally
1. Clone or open the repository locally.
2. Build and run the project using Maven:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```
3. Access the application interface via your browser at `http://localhost:8080`.

### Running with Docker
You can spin up the application container using the provided configuration files:
```bash
docker compose up --build