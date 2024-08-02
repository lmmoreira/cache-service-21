# Cache Service 21

Supposed to be a lib for cache.

Supposed to be installed on your Nexus on deploy stage.

## Important

Java and Spring versions are important.

<groupId>com.leonardo.cache</groupId>
<artifactId>service</artifactId>
<version>1.${java.version}.${spring-boot.version}</version>

Project version takes java version and spring boot version on its complement.

If a new Java comes a new deploy for it must be done, same for spring. In order to do not have deprecated code.