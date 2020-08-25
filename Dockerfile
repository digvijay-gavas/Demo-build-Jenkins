FROM openjdk:8
COPY ./target/hello-world-demo.jar hello-world-demo.jar
EXPOSE 8080
ENTRYPOINT java -jar hello-world-demo.jar