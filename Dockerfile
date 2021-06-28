FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:1.1-13.1622515602
COPY --chown=jboss:jboss . /opt/greeting
WORKDIR /opt/greeting
RUN ./mvnw package -Dmaven.test.skip=true
ENTRYPOINT ["java", "-jar", "/opt/greeting/target/quarkus-app/quarkus-run.jar"]
