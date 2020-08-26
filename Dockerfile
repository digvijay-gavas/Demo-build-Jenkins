FROM openjdk:8
COPY ./target/hello-world-demo.jar hello-world-demo.jar
EXPOSE 5060
ENTRYPOINT java -jar hello-world-demo.jar