FROM openjdk
EXPOSE 8080
ADD target/projet.jar projet
WORKDIR /Br13
COPY . .
ENTRYPOINT [ "java","-jar","/projet.jar" ]