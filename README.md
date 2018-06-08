./mvnw clean package

java -jar mvc-test/target/mvc-test-0.0.1-SNAPSHOT.jar
#in 2nd terminal
curl localhost:8080/hello/asdfas # Hello asdfas
curl localhost:8080/metrics #asdfas is not in output

java -jar jersey-test/target/jersey-test-0.0.1-SNAPSHOT.jar
curl localhost:8080/api/hello/asdfas # Hello asdfas
curl localhost:8080/metrics #asdfas is in output