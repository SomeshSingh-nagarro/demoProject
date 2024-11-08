FROM tomcat:7 

ARG AUTH_TOKEN
ARG BUILD_NUMBER

RUN curl -fsSL -H "Authorization: Bearer ${AUTH_TOKEN}" -o /usr/local/tomcat/webapps/ROOT.war http://192.168.29.247:8082/artifactory/artifacts/${BUILD_NUMBER}


EXPOSE 8080

CMD ["catalina.sh", "run"]
