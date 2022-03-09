# The first line is always FROM - this defines a base image: i need tomcat and java 8
FROM tomcat:8.0-jre8

LABEL maintainer="William Geary"

# lets imagine that the WAR file, already exit's 
# we want to pass the WAR file to tomcats webapps direcotry

ADD target/FrontController.war /usr/local//tomcat/webapps

# The Expose Command informs Docker that the container listens on some specified port 
# at runtime 
EXPOSE 8080

# The CMD instruciton specifies what to run when the container is running 
# In our case the tomcat server is started by running this shell script
CMD ["catalina.sh", "run"]
