FROM khipu/openjdk17-alpine
EXPOSE 8080
ADD target/MyApp23.jar MyApp3000.jar
ENTRYPOINT ["java","-jar","MyApp3000.jar"]