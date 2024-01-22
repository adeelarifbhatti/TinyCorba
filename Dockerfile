FROM ubuntu:latest
LABEL maintainer="adeelarifbhatti@gmail.com"
WORKDIR /app
RUN apt-get update && apt-get install -y openjdk-8-jdk
COPY src/Server Server
COPY src/CountryCapital.idl CountryCapital.idl
COPY src/Server Server
COPY start.sh ./
EXPOSE 900
RUN idlj -fall CountryCapital.idl
RUN javac CountryCapital/*.java
RUN javac  Server/*.java
RUN chmod +x ./start.sh
ENTRYPOINT ["./start.sh"]
