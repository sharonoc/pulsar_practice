package org.overstock.producers;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.impl.schema.JSONSchema;
import org.overstock.pojos.Foo;

import java.util.Date;

public class PojoToJsonProducer {

    public static String topic = "pojo_topic";

    public static void main(String[] args) throws Exception {

        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Producer<Foo> producer = client.newProducer(JSONSchema.of(Foo.class)).topic(topic).create())
        {
            long startTime = new Date().getTime();
            int i = 0;
            while(i < 100000)
            {
                Foo foo = new Foo();
                foo.setField1(i);
                foo.setField2("foo" + i);
                foo.setField3(System.currentTimeMillis());
                producer.send(foo);
                i++;
            }
            long duration = new Date().getTime() - startTime;
            System.out.println("Duration " + duration);
        }
    }
}

/*
100,000 took Duration 155131
INFO: [pojo_topic] [standalone-2-77] Pending messages: 1 --- Publish throughput: 642.86 msg/s --- 0.29 Mbit/s --- Latency: med: 1.540 ms - 95pct: 1.767 ms - 99pct: 1.998 ms - 99.9pct: 2.786 ms - max: 68.106 ms --- Ack received rate: 642.85 ack/s --- Failed messages: 0
Nov 26, 2019 1:30:08 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [pojo_topic] [standalone-2-77] Pending messages: 1 --- Publish throughput: 649.50 msg/s --- 0.29 Mbit/s --- Latency: med: 1.537 ms - 95pct: 1.703 ms - 99pct: 1.842 ms - 99.9pct: 2.070 ms - max: 25.665 ms --- Ack received rate: 649.50 ack/s --- Failed messages: 0
 */