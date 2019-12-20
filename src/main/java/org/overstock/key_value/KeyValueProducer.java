package org.overstock.key_value;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.common.schema.KeyValue;

public class KeyValueProducer {

    public static void main(String[] args) throws PulsarClientException {

        PulsarClient pulsarClient = null;
        Producer<KeyValue<Integer, String>> producer = null;

        try {
            pulsarClient = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();


            producer = pulsarClient.newProducer(KeyValueSchema.kvSchema)
                    .topic("kv_topic")
                    .create();

            int i = 0;
            while (i < 100000) {
                producer.newMessage()
                        .value(new KeyValue<>(i, "valueString"))
                        .send();
                i++;
            }

        } catch (Exception e) {
            System.out.println();
        }
        finally {
            if (producer != null);
                producer.close();
            if (pulsarClient != null);
                pulsarClient.close();
        }
    }
}
