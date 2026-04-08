# Flight Booking API

## How to Run
mvn spring-boot:run

---

## API

### Book a flight
POST /flights/{flightNumber}/book

Example:
curl -X POST http://localhost:8080/flights/AI101/book \
-H "Content-Type: application/json" \
-d '{"passengerName":"John"}'

---

## Sample Flights
- AI101 (capacity: 2)
- BA202 (capacity: 3)

## AI Usage (Step 1)
### Prompts Used

Prompt 1:Generate a Spring Boot REST API in Java for a flight booking system.
Requirements:
- In-memory storage 
- Flight model with capacity and booked seats 
- Booking endpoint 
- Prevent overbooking 
- No database 

Prompt 2:Improve the previous code:
- Add exception handling
- Add DTOs
- Use thread-safe collections
- Improve structure (controller, service, model)


---

##  Manual Improvements (Step 2)

The following improvements were made after reviewing the AI-generated solution:

- Fixed incorrect package structure and project setup issues
- Configured Gradle and Java 17 environment properly
- Added custom exceptions for better error handling
- Improved HTTP status codes (404, 409)
- Cleaned up code structure and naming conventions
- Ensured thread safety in booking logic

---

##  Known Issues / Limitations

- No persistent storage (data resets on restart)
- Basic synchronization (not scalable for distributed systems)
- No input validation (e.g., empty passenger name)
- No booking retrieval endpoints

---

## Improvements With More Time

- Add persistent database (e.g., PostgreSQL)
- Implement input validation using Spring Validation
- Add APIs for retrieving bookings and flight details
- Improve concurrency handling (e.g., locks or optimistic locking)
- Add unit and integration tests
- Add logging and monitoring  
