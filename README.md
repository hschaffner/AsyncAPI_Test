# AsyncAPI_Test
Test to use AsyncAPI and Solace code generator to create Spring Cloud Streams application.

This is a SpringBoot application that is based on code generated from the Solace PubSub+ Event Portal JSON schema.

The generated code was modified to republish the code to the Solace PubSub+ Kafka Source Connector in the required JSON format:

```
{ "schema": {JSON Schema}, "payload": {JSON Payload}}
```

This is the required format for storage in the Kafka topic when the connector enables schema references and makes use of the following COnnector Converter:

```
org.apache.kafka.connect.json.JsonConverter
```

Compile with:

```
mvn clean install
```

Run with:

```
mvn spring-boot:run
```

