FROM java:8
EXPOSE 8080
ADD /target/Candidate-0.0.1-SNAPSHOT.jar candidate.jar
ENTRYPOINT ["java", "-jar", "candidate.jar"]