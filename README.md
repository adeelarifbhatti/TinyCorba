# Corba "Key Value"

It uses openjdk-8-jdk, later versions have discontinued the Corba support. The docker image is created by installing openjdk-8-jdk in ubuntu-latest, running idlj -fall CountryCapital.idl to get CountryCapital/ generated.

### The "Key Value"

With the client we can enter the key-value in the Hashmap. To enter the key value use following on the client

###### java Client/Client -ORBInitialPort 900 -ORBInitialHost server
###### set  Norway Oslo

To retrieve the value enter the following command on the client

###### java Client/Client -ORBInitialPort 900 -ORBInitialHost server
###### get  Norway


In the client image following commands are run

###### javac  Client/*.java
###### javac CountryCapital/*.java

 In the server image 900 is exposed and following commands are run

###### javac  Server/*.java
###### javac CountryCapital/*.java -ORBInitialPort 900 -ORBInitialHost server

To run the app, just clone it and execute following command 
#### docker-compose up