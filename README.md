## build

mvn clean package

native-image --no-fallback --report-unsupported-elements-at-runtime --allow-incomplete-classpath --verbose -jar ./target/graalvm-groovy-demo-1.0-SNAPSHOT.jar ./target/app

java -agentlib:native-image-agent=config-output-dir=./src/main/resources/META-INF/native-image/org.example/graalvm-groovy-demo/ -jar ./target/graalvm-groovy-demo-1.0-SNAPSHOT.jar