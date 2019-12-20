package org.overstock.consumers;

import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.Message;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.impl.schema.AvroSchema;
import org.overstock.generated_classes.avro.User;
import org.overstock.producers.AvroClassProducer;

import java.io.IOException;

public class AvroClassConsumer {

    public static void main(String[] args) throws IOException {

        try(PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
            Consumer<User> consumer = client.newConsumer(AvroSchema.of(User.class))
                    .subscriptionName("avro_user_subscription")
                    .topic(AvroClassProducer.topic)
                    .subscribe();)
        {

            while (true) {
                Message msg = consumer.receive();
                try {
                    User t = (User) msg.getValue();
                    System.out.println(t);
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    System.out.println(e);
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
