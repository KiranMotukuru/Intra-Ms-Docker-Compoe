# Containerising Microservice Application

This Project Demonstrates the Communication Between Two Microservices Using Docker.  
and Registers with an **Eureka Server**


## Two microservices
**OrderService**.  
**ProductService**


## Total  running 3 Containers
**EurekaServer** ----->  **1 container**.  

**ProductService** ----->  **2 container**.  

**OrderService** ----->  **3 container**

# Sample Diagram

<img width="1133" height="513" alt="image" src="https://github.com/user-attachments/assets/f3d86d99-71c8-4fe3-b310-9c3123e28a63" />


# Running in Local

first run **ProductService**

 ```
http://localhost:8081/products/444
```


second run **OrderService**

```
http://localhost:8080/users/1/product/444
```


Third run  **EurekaServer**

```
http://localhost:8761/
```



# Application Running In Local Successfully 


         







