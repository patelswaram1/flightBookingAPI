# Flight Booking API

## How to Run
mvn spring-boot:run

## API

### Book a flight
POST /flights/{flightNumber}/book

Example:
curl -X POST http://localhost:8080/flights/AI101/book \
-H "Content-Type: application/json" \
-d '{"passengerName":"John"}'

## Sample Flights
- AI101 (capacity: 2)
- BA202 (capacity: 3)

## What I would improve with more time
- Add persistent database (PostgreSQL)
- Add booking retrieval endpoints
- Add validation (e.g., empty passenger name)
- Improve concurrency handling with locks