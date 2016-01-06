# spring-boot-no-banner-variable
To reproduce the problem:
```mvn package```
then
```java -jar target/test-1.1.0-SNAPSHOT.war```

The banner.txt variable ```${application.formatted-version}``` does not appear in the console.
