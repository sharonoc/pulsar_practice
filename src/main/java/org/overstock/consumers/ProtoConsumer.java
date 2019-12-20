package org.overstock.consumers;

import org.apache.pulsar.client.api.*;
import org.overstock.generated_classes.protobuf.LongStringProto.LongString;
import org.overstock.producers.ProtoProducer;

import java.io.IOException;

public class ProtoConsumer {

    public static void main(String[] args) throws IOException {

        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Consumer consumer = client.newConsumer(Schema.PROTOBUF(LongString.class))
                     .subscriptionName("long_string_subscription")
                     .topic(ProtoProducer.topic)
                     .subscribe())
        {

            while (true) {
                Message msg = consumer.receive();
                try {
                    LongString t = LongString.parseFrom(msg.getData());
                    consumer.acknowledge(msg);
                } catch (Exception e) {
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
    }
}
