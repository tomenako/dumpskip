# FROM java:openjdk-8u181-jdk

FROM openjdk:8u181-jdk

# Install Maven
RUN cd /usr/local/ && wget -nv http://ftp.tsukuba.wide.ad.jp/software/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz && tar xf apache-maven-3.3.9-bin.tar.gz

# Environment variables
ENV MAVEN_HOME /usr/local/apache-maven-3.3.9
ENV PATH $PATH:$MAVEN_HOME/bin

# Clean up

RUN rm -rf /usr/local/apache-maven-3.3.9-bin.tar.gz

COPY target/illegal-dumps-api-0.99.jar wastes.jar

EXPOSE 8888

CMD ["java", "-jar", "wastes.jar"]
