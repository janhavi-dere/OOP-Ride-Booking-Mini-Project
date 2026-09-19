# Mini Project Report - OOP Ride Booking System

## Introduction
The Ride Booking System is a simple Java console application created to demonstrate Object-Oriented Programming concepts. The system models a basic ride-booking workflow using separate classes for users, riders, drivers, rides, and fare calculation.

## Objectives
- Understand classes and objects.
- Demonstrate encapsulation.
- Demonstrate inheritance through `Rider` and `User`.
- Divide a problem into reusable classes.
- Implement a simple fare calculation system.

## Methodology
**User Input → Rider Creation → Driver Assignment → Distance/Ride Type → Fare Calculation → Ride Object → Ride Details**

## Classes
- **User:** common user information.
- **Rider:** extends User and represents a customer.
- **Driver:** driver and vehicle information.
- **FareCalculator:** calculates fare from distance and ride type.
- **Ride:** combines rider, driver, ride details and fare.
- **Main:** console interface and application flow.

## OOP Concepts
| Concept | Application |
|---|---|
| Class | User, Rider, Driver, Ride, FareCalculator |
| Object | Rider and Driver objects are created at runtime |
| Encapsulation | Private data members with public methods |
| Inheritance | Rider extends User |
| Constructor | Used to initialize objects |
| Association | Ride uses Rider and Driver objects |

## Conclusion
The project provides a small practical example of applying OOP concepts to a real-world style problem. It demonstrates how separate classes can represent different entities and work together to complete a ride-booking operation.
