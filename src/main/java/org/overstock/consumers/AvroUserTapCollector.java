package org.overstock.consumers;

import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.Message;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.client.impl.schema.AvroSchema;
import org.overstock.generated_classes.avro.User;

import java.io.IOException;

public class AvroUserTapCollector {

    public static void main(String[] args) throws IOException {

        try(PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
            Consumer<String> consumer = client.newConsumer(Schema.STRING)
                    .subscriptionName("avro_tap_subscription")
                    .topic("avro_user_tap")
                    .subscribe();)
        {

            while (true) {
                Message msg = consumer.receive();
                try {
                    System.out.println(msg.getMessageId());
                    System.out.println(msg.getValue());
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    System.out.println(e);
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
