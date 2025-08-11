# Spring Boot WebSocket Chat Demo

A simple **Spring Boot + WebSocket (STOMP)** chat application that demonstrates real-time messaging between multiple browser clients.

## 📌 Features
- WebSocket communication using **Spring Boot** and **STOMP over SockJS**
- Broadcast messages to all connected clients
- Minimal HTML/JavaScript front-end
- No database required — purely in-memory

---

## 🛠 Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Spring WebSocket**
- **SockJS & STOMP.js** (client-side)
- Maven

---

## 📂 Project Structure
├─ src/main/java/com/example/websocketdemo/
│ ├─ WebsocketDemoApplication.java # Spring Boot main class
│ ├─ WebSocketConfig.java # WebSocket/STOMP configuration
│ ├─ ChatController.java # Handles incoming chat messages
├─ src/main/resources/static/
│ ├─ index.html # Simple HTML + JS chat client
├─ pom.xml # Maven dependencies
├─ README.md # This file


3️⃣ Build & Run
mvn spring-boot:run
Or run directly from your IDE by executing:
WebsocketDemoApplication


4️⃣ Access the App
Open your browser and go to:
http://localhost:8080