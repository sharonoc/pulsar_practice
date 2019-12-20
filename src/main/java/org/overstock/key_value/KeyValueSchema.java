package org.overstock.key_value;

import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.common.schema.KeyValue;
import org.apache.pulsar.common.schema.KeyValueEncodingType;

public class KeyValueSchema {

    public static Schema<KeyValue<Integer, String>> kvSchema = Schema.KeyValue(
            Schema.INT32,
            Schema.STRING,
            KeyValueEncodingType.SEPARATED
    );
}
