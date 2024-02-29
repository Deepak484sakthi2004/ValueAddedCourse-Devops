# PRODUCTIONIZE A SIMPLE JAVA APPLICATION
Using Maven for packaging the java application and Integraring it using Jenkins

## Getting Started
Create a AWS cloud Account and create three EC2 intances of ubuntu linux AMI, else use any of the Virtualization
software to create three VM's
Name them JenkinsServer, QAserver and ProdServer namely

### Required Dependencies 
# Jenkins Server
Clone to the apt repository, to get the updates to the local machine!
       ```cmd
sudo apt-get update
     ```
- Java
       ```cmd
  sudo apt-get install openjdk-11-jdk
     ```
- Git, Maven
     ```cmd
sudo apt-get install git maven
```
- Jenkins
       ```cmd
wget .jar // jenkins download jar file from jenkins.io
     ```

# QA and Prod Server
Clone to the apt repository, to get the updates to the local machine!
       ```cmd
sudo apt-get update
     ```
- tomcat9
       ```cmd
sudo apt-get install tomcat9
     ```
-tomcat9 -admin
       ```cmd
sudo apt-get install tomcat9 -admin
     ```


### Prerequisites
Before you start, make sure you have the following:
- Maven installed in your the local machine or in the cloud server
