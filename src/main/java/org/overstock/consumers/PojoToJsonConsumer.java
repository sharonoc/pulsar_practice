package org.overstock.consumers;

import org.apache.pulsar.client.api.*;
import org.apache.pulsar.shade.com.fasterxml.jackson.databind.ObjectMapper;
import org.overstock.pojos.Foo;
import org.overstock.producers.PojoToJsonProducer;

public class PojoToJsonConsumer {

    public static void main(String[] args) throws PulsarClientException {

        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Consumer consumer = client.newConsumer(Schema.JSON(Foo.class))
                     .topic(PojoToJsonProducer.topic)
                     .subscriptionName("pojo_subscription")
                     .subscribe()) {

            while (true) {
                Message msg = consumer.receive();
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    Foo foo = mapper.readValue(msg.getData(), Foo.class);
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
