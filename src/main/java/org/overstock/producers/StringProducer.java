package org.overstock.producers;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class StringProducer {

    public static String topic = "pdp_input_topic";

    public static void main(String[] args) throws IOException {

        try (PulsarClient pulsarClient = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Producer producer = pulsarClient.newProducer(Schema.STRING).topic(topic).create())
        {
            int i = 0;
            String output = new String(Files.readAllBytes(Paths.get("/Users/shoconnor/IdeaProjects/pulsar/src/main/resources/pdp-data-missing-scores.json")));
            while (i < 10)
            {
                System.out.println(output);
                producer.send(output);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
100,000 messages
INFO: [string_topic] [standalone-2-82] Pending messages: 1 --- Publish throughput: 649.34 msg/s --- 0.31 Mbit/s --- Latency: med: 1.532 ms - 95pct: 1.757 ms - 99pct: 2.080 ms - 99.9pct: 2.395 ms - max: 38.509 ms --- Ack received rate: 649.33 ack/s --- Failed messages: 0
Nov 26, 2019 1:53:50 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [string_topic] [standalone-2-82] Pending messages: 1 --- Publish throughput: 657.61 msg/s --- 0.32 Mbit/s --- Latency: med: 1.529 ms - 95pct: 1.688 ms - 99pct: 1.763 ms - 99.9pct: 1.805 ms - max: 21.145 ms --- Ack received rate: 657.61 ack/s --- Failed messages: 0
Duration 152884
Larger message
Nov 26, 2019 4:45:49 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [string_topic] [standalone-2-104] Pending messages: 1 --- Publish throughput: 554.87 msg/s --- 150.98 Mbit/s --- Latency: med: 1.702 ms - 95pct: 2.077 ms - 99pct: 2.460 ms - 99.9pct: 2.957 ms - max: 521.797 ms --- Ack received rate: 554.85 ack/s --- Failed messages: 0
Nov 26, 2019 4:46:49 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [string_topic] [standalone-2-104] Pending messages: 1 --- Publish throughput: 560.23 msg/s --- 152.44 Mbit/s --- Latency: med: 1.701 ms - 95pct: 1.993 ms - 99pct: 2.292 ms - 99.9pct: 4.017 ms - max: 418.940 ms --- Ack received rate: 560.23 ack/s --- Failed messages: 0
Nov 26, 2019 4:47:49 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [string_topic] [standalone-2-104] Pending messages: 1 --- Publish throughput: 536.86 msg/s --- 146.08 Mbit/s --- Latency: med: 1.738 ms - 95pct: 2.155 ms - 99pct: 2.561 ms - 99.9pct: 15.859 ms - max: 574.085 ms --- Ack received rate: 536.86 ack/s --- Failed messages: 0
Duration 182162

Increased by 29,278 ms
 */
