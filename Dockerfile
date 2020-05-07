# FROM java:openjdk-8u181-jdk

FROM openjdk:8u181-jdk

# Install Maven
RUN cd /usr/local/ && wget -nv http://ftp.tsukuba.wide.ad.jp/software/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz && tar xf apache-maven-3.3.9-bin.tar.gz

# Environment variables
ENV MAVEN_HOME /usr/local/apache-maven-3.3.9
ENV PATH $PATH:$MAVEN_HOME/bin

# Clean up

RUN rm -rf /usr/local/apache-maven-3.3.9-bin.tar.gz

RUN mkdir app

COPY target/illegal-dumps-api-0.99.jar app/wastes.jar

COPY app.properties app/application.properties

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "/app/wastes.jar"]
CMD ["--spring.config.location=/app/application.properties"]
