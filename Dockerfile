FROM amazoncorretto:8

WORKDIR /app

COPY target/cabosapp.war /app

EXPOSE 9001
CMD ["java", "-jar", "-Dapp.host=0.0.0.0", "cabosapp.war"]