package org.overstock.consumers;

import org.apache.pulsar.client.api.*;
import org.apache.pulsar.shade.com.google.gson.Gson;
import org.apache.pulsar.shade.com.google.gson.JsonObject;
import org.apache.pulsar.shade.com.google.gson.JsonParser;
import org.overstock.pojos.Foo;
import org.overstock.producers.JasonProducer;

public class JsonConsumer {

    public static void main(String[] args) throws PulsarClientException {

        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Consumer consumer = client.newConsumer(Schema.STRING)
                     .topic(JasonProducer.topic)
                     .subscriptionName("json_subscription").subscribe())
        {
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();

            while (true) {
                Message msg = consumer.receive();
                try {
                    JsonObject jsonObject = parser.parse(String.valueOf(msg.getValue())).getAsJsonObject();
                    Foo foo = gson.fromJson(jsonObject, Foo.class);
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    System.out.println(e);
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
