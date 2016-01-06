# spring-boot-no-banner-variable
To reproduce the problem:

```mvn package```

then

```java -jar target/test-1.1.0-SNAPSHOT.war```

The banner.txt variable ```${application.formatted-version}``` does not appear in the console:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::   (v1.3.1.RELEASE)

MYAPP VERSION

```
