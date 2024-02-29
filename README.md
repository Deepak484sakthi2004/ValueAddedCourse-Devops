# ValueAddedCourse-Devops
A simple demonstration of complete FreeStyle project using Jenkins.
## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Jenkins Integration](#jenkins-integration)
  - [Jenkins Server Setup](#jenkins-server-setup)
  - [QA and Prod Server Setup](#qa-and-prod-server-setup)
  - [Integrating Java Application](#integrating-java-application-using-maven-and-jenkins)
- [Usage](#usage)

## Getting Started
- Create a AWS cloud Account and create three EC2 intances of ubuntu linux AMI, else use any of the Virtualization
- software to create three VM's
Name them JenkinsServer, QAserver and ProdServer namely

### Prerequisites

Before you begin, ensure you have the following:

- [ ] AWS account or VM's and EC2 instances created.
- [ ] Java, Git, and Maven installed on JenkinsServer.
- [ ] Tomcat9 installed on QAserver and ProdServer.

### Installation

1. **Create AWS EC2 Instances:**
   - Create three EC2 instances named JenkinsServer, QAserver, and ProdServer using the Ubuntu Linux AMI.

2. **Jenkins Server Setup:**
   - SSH into JenkinsServer:
     ```bash
     ssh -i path/to/your/key.pem ubuntu@JenkinsServer_Public_IP
     ```
   - Update apt repository:
     ```bash
     sudo apt-get update
     ```
   - Install Java, Git, and Maven:
     ```bash
     sudo apt-get install openjdk-11-jdk git maven
     ```
   - Download Jenkins:
     ```bash
     wget http://updates.jenkins-ci.org/download/war/2.319/jenkins.war
     ```
   - Run Jenkins on port 8080:
     ```bash
     java -jar jenkins.war --httpPort=8080
     ```
   - Access Jenkins in your browser using `http://JenkinsServer_Public_IP:8080`, and follow the setup wizard to complete the installation.

3. **QA and Prod Server Setup:**
   - SSH into QAserver and ProdServer similarly.
   - Update apt repository:
     ```bash
     sudo apt-get update
     ```
   - Install Tomcat9:
     ```bash
     sudo apt-get install tomcat9
     ```
   - Install Tomcat9 admin:
     ```bash
     sudo apt-get install tomcat9-admin
     ```
   - Note: Configure Tomcat users and permissions for the admin console.

## Jenkins Integration

### Integrating Java Application using Maven and Jenkins

1. **Maven Project:**
   - Create a simple Java project using Maven. Ensure your project structure is suitable for packaging.

2. **Jenkins Setup:**
   - Open Jenkins in your browser (`http://JenkinsServer_Public_IP:8080`).
   - Install necessary plugins (Maven Integration, Git, etc.) from the Jenkins dashboard.

3. **Create Jenkins Job:**
   - Create a new Jenkins job:
     - Choose "Freestyle project."
     - Configure source code management with your Git repository.
     - Add a build step to build the Maven project.
     - Configure post-build actions to deploy the artifact to the QAserver or ProdServer.

4. **Configure QA and Prod Servers in Jenkins:**
   - In Jenkins, navigate to "Manage Jenkins" -> "Manage Nodes and Clouds."
   - Add QAserver and ProdServer as Jenkins nodes.
   - Configure the nodes with necessary information (labels, credentials).

5. **Build and Deploy:**
   - Trigger the Jenkins job manually or set up webhooks to trigger builds automatically on code changes.
   - Verify that the artifacts are deployed to the QA and Prod servers.

## Usage



 
