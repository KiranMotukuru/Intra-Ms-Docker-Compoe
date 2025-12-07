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



## Application Running In Local Successfully 


# Steps To Run in Linux(Ubuntu)
# phase -1 Install Softwares

## Step : 1   Install Git

```
sudo apt update
sudo apt install git
```

## verify Git installation

```
git --version
```

## Step : 2   Install Docker (Ubuntu)

```
sudo apt update
curl -fsSL get.docker.com | /bin/bash
sudo usermod -aG docker ubuntu 
exit
```
## verify Docker installation

```
docker -v
```

Note :  We dont need **Jre** & **maven**  as Softwares Installation, Because These Softwares are Installed in Image. for more info check **Docker File**
        **phase -1 is completed**


 # Phase -2

 ## Step : 1 Clone the Git Repo

```
https://github.com/KiranMotukuru/Intra-Ms-Docker-Compoe.git
```

## Step : 2 Navigate Through  cloned Directory

 we have 3 Microservices 
 ex:  Go to the  **ProductService**  where **Docker File** Presents  

 # Build Docker Image 

synatx :  docker build -t your-image-name .(current Directory)

# Navigate to productservice

```
docker build -t productservice .
```
# Navigate to userservice

```
docker build -t userservice .
```

# Navigate to EurekaServer

```
docker build -t eurekhaserver .
```




 



         







