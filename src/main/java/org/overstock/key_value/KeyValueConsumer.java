package org.overstock.key_value;

import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.Message;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.common.schema.KeyValue;

public class KeyValueConsumer {

    public static void main(String[] args) throws PulsarClientException {

        PulsarClient client = null;

        try
        {
            client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
            Consumer consumer = client.newConsumer(KeyValueSchema.kvSchema)
                    .subscriptionName("kv_topic_subscription")
                    .topic("kv_topic")
                    .subscribe();
            while(true)
            {
                Message<KeyValue<Integer, String>> msg = consumer.receive();
                try {
                    KeyValue<Integer, String> kv = msg.getValue();
                    System.out.println(kv);
                }
                catch(Exception e)
                {
                    System.out.println(msg);
                    consumer.negativeAcknowledge(msg);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            if(client != null){
                client.close();
            }
        }
    }
}
