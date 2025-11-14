FROM alpine:latest
RUN apk add openjdk21
ENV export PATH=$PATH:/usr/lib/jvm/java-21-openjdk/bin/javac
WORKDIR /app
ADD helloWorld.java helloWorld.java
ENTRYPOINT javac helloWorld.java && java helloWorld