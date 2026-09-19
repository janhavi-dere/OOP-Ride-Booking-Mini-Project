# OOP Ride Booking Mini Project

A simple console-based ride booking application developed as a Second Year CSE OOP mini project.

## Project Details
- **Subject:** Object-Oriented Programming (OOP)
- **Year:** SY CSE
- **Panel:** C
- **Language:** Java
- **Type:** Console application

## Overview

The project demonstrates basic Object-Oriented Programming concepts through a simplified ride-booking system. A user can enter rider details, choose a driver and ride type, and receive a calculated fare.

## Main Classes

- `User` - stores customer information.
- `Rider` - represents the rider/customer requesting a ride.
- `Driver` - stores driver information and vehicle details.
- `Ride` - connects a rider and driver for a trip.
- `FareCalculator` - calculates the fare based on distance and ride type.
- `Main` - demonstrates the application flow.

## OOP Concepts Demonstrated

- Classes and objects
- Encapsulation
- Constructors
- Methods
- Inheritance (`Rider` extends `User`)
- Association between objects

## How to Run

```bash
javac src/*.java
java -cp src Main
```

## Project Note

The supplied academic brief contains the title **Fibonacci Series** but lists ride-booking entities such as `User`, `Rider`, `Driver`, `FareCalculator`, and `Ride`. This implementation follows the listed entities and creates one consistent OOP ride-booking project rather than mixing unrelated requirements.
