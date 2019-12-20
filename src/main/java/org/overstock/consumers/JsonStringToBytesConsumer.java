package org.overstock.consumers;

import org.apache.pulsar.client.api.*;
import org.apache.pulsar.shade.com.fasterxml.jackson.databind.JsonNode;
import org.apache.pulsar.shade.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.pulsar.shade.com.fasterxml.jackson.databind.node.ObjectNode;
import org.overstock.producers.JsonStringToBytesProducer;

public class JsonStringToBytesConsumer {

    public static void main(String[] args) throws PulsarClientException {

        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Consumer consumer = client.newConsumer(Schema.AUTO_CONSUME())
                     .topic(JsonStringToBytesProducer.topic)
                     .subscriptionName("auto_subscription").subscribe())
        {
            while (true) {
                Message msg = consumer.receive();
                try {
                    ObjectMapper om = new ObjectMapper();
                    JsonNode n = om.readTree(msg.getData());
//                    if (! n.has("field7"))
//                        ((ObjectNode) n).put("field7", 100);
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    System.out.println(e);
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
