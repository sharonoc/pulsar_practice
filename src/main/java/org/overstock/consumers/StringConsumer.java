package org.overstock.consumers;

import org.apache.pulsar.client.api.*;
import org.overstock.producers.StringProducer;

public class StringConsumer {

    public static void main(String[] args) throws PulsarClientException {

        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Consumer consumer = client.newConsumer(Schema.STRING).topic(StringProducer.topic).subscriptionName("product_sub").subscribe()) {

            while (true) {
                Message msg = consumer.receive();
                try {
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
