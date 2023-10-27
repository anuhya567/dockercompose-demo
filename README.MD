# First Scenario

MySql image is running in docker container which has been defined in docker compose file
Demo service image is running in docker container -> In application.yaml url is localhost:3306

## Description
Here demo image will not run successfully as a docker container because mysql container and demo containers are 2 different containers, they cannot communicate with each other using localhost:3306

# Second Scenario

MySql image is running in docker container which has been defined in docker compose file
Demo service image is running in docker container -> In application.yaml url is ipaddress:3306
## Description
Here ,Our spring boot application running in docker container will communicate with Host Machine(My Machine) Mysql engine. But this will be a problem in production environments.

# Third Scenario

MySql image is running in docker container which has been defined in docker compose file
Demo service image is running aindocker container -> In application.yaml url is mysqldb:3306(mysqldb is service name in docker compose)
## Description
Now here Both images are defined  as services in docker compose file. Now demo container can communicate with mysql engine which is running in another container through a default network because when we define service in docker compose file then all the service defined in docker compose file can communicate with each other using service names as well same ports. 