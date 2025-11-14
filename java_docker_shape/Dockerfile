FROM alpine:latest
RUN apk add openjdk21
ENV PATH=$PATH:/usr/lib/jvm/java-21-openjdk/bin
WORKDIR /app
COPY GeometricCalculator.java GeometricCalculator.java
RUN javac GeometricCalculator.java
CMD ["java", "-Djava.awt.headless=false", "GeometricCalculator"]