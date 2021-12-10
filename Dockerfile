From openjdk:8
EXPOSE 8092
copy ./target/Producer-0.0.1-SNAPSHOT.jar Producer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Producer-0.0.1-SNAPSHOT.jar"]