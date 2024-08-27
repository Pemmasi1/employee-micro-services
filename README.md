# springboot-3-microservices
springboot-3-microservices
# employee-micro-services


This is a microservices application that has employee and department microservices. It has Zipkin integrated to it for logging and monitoring.
It has Api gateway which transfers api calls to respective services and which is secured by jwt token verification. It has Webflux security.

microservices has a discover server and also a central configuration server for application.properties. 

Thanks to Daily Code buffer youtube video that helped me build this app.

Next Steps:
build CI/CD pipeline
deploy app to aws ecs
build UI using angular.