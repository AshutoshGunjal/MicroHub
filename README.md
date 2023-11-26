# Microservices With Spring

<p align="center">
  <img src="https://github.com/AshutoshGunjal/Microservices-With-Spring/blob/main/Image1.png" alt="Image Alt Text">
</p>

## Limits Service
**Description:** Limits microservice defines a Java bean class with 'minimum' and 'maximum' properties, encapsulating the range limits for a specific functionality.  
**Endpoint:** [http://localhost:8080/limits](http://localhost:8080/limits)

## Currency Exchange Service
**Description:** This microservice is designed to handle the conversion values between different currencies. Its primary purpose is to provide users with accurate and up-to-date exchange rates for various currency pairs.  
**Endpoint:** [http://localhost:8000/currency-exchange/from/CAD/to/INR](http://localhost:8000/currency-exchange/from/CAD/to/INR)

<div align="center">
  <img src="https://github.com/AshutoshGunjal/Microservices-With-Spring/blob/main/Image3.png" alt="Image Alt Text">
</div>

## Currency Conversion Service
**Description:** This microservice is designed to handle the specific task of converting a specified quantity of one currency into another, based on the current exchange rate.  
**Endpoints:**
- [http://localhost:8100/currency-conversion/from/CAD/to/INR/quantity/10](http://localhost:8100/currency-conversion/from/CAD/to/INR/quantity/10)
- [http://localhost:8100/currency-conversion-feign/from/CAD/to/INR/quantity/10](http://localhost:8100/currency-conversion-feign/from/CAD/to/INR/quantity/10)

## Eureka Naming Server

<div align="center">
  <img src="https://github.com/AshutoshGunjal/Microservices-With-Spring/blob/main/Image2.png" alt="Image Alt Text">
</div>

**Description:** It is the most important component in microservices architectures, offering a solution for service registration, discovery, and load balancing.
- **Service Registration:** Naming server allows microservices to register themselves. So, when a service starts up, it registers with the Eureka server, providing information about its host, port, health indicators, and other metadata.
- **Service Discovery:** Microservices that need to discover and communicate with other services can query the Eureka Naming Server to obtain the network location (host and port) of the required services. This enables dynamic discovery in a distributed system.
- **Load Balancing:** Eureka can be used in conjunction with load balancing solutions to distribute incoming requests across multiple instances of a service. Clients can retrieve a list of available instances from Eureka and use a load balancer to distribute traffic.  
  **Endpoint:** [http://localhost:8761/](http://localhost:8761/)

## Spring Cloud Config Server
**Description:** Provides centralized external configuration management for distributed systems. In the context of microservices, the Spring Cloud Config Server plays a crucial role in managing and distributing configuration settings for microservices applications.  
**Endpoints:**
- [http://localhost:8888/limits-service/default](http://localhost:8888/limits-service/default)
- [http://localhost:8888/limits-service/qa](http://localhost:8888/limits-service/qa)
- [http://localhost:8888/limits-service/dev](http://localhost:8888/limits-service/dev)

## API Gateway
**Description:** Spring Cloud Gateway is a part of the Spring Cloud project and serves as an API gateway for microservices architectures. It provides essential features for routing, filtering, and load balancing HTTP requests to various microservices.  
**Initial Endpoints:**
- [http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR](http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR)
- [http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10](http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10)
- [http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10](http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10)

**Updated Endpoints:**
- [http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR](http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR)
- [http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10](http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10)
- [http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10](http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10)
