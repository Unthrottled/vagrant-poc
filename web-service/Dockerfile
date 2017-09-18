FROM maven:latest as packager
WORKDIR /app
ADD . .
RUN ls -a
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY . .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml clean package

FROM jboss/wildfly
MAINTAINER Alex Simons "alex@acari.io"

COPY --from=packager /app/target/vagrant-poc.war /opt/jboss/wildfly/standalone/deployments
