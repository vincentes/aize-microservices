## Architecture

The case study was built using the following modules:
- **gateway-service** - a module that uses Spring Cloud to run a Spring Boot application that acts as a gateway.
- **config-service** - a module that uses Spring Cloud Config Server to run a configuration server. The configuration files are placed on the classpath.
- **discovery-service** - a module that uses Spring Cloud Netflix Eureka as a discovery server.
- **product-service** - a module containing the operations of the product model.
- **cart-service** - a module containing the operations of the cart model.
