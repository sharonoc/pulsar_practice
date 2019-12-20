package org.overstock.functions;

import org.apache.pulsar.common.functions.FunctionConfig;
import org.apache.pulsar.functions.LocalRunner;
import org.apache.pulsar.functions.api.Context;
import org.apache.pulsar.functions.api.Function;
import org.apache.pulsar.functions.api.Record;

import java.util.Collections;

public class MyCountLocalRunner implements Function<Object, Void> {

    @Override
    public Void process(Object s, Context context) throws Exception {
        Record record = context.getCurrentRecord();
        System.out.println(record.getDestinationTopic());
        System.out.println(context.getOutputSchemaType());
        return null;
    }

    public static void main(String[] args) throws Exception {
        FunctionConfig functionConfig = new FunctionConfig();
        functionConfig.setName("exclamation");
        functionConfig.setInputs(Collections.singleton("avro_user"));
        functionConfig.setClassName(MyCountLocalRunner.class.getName());
        functionConfig.setRuntime(FunctionConfig.Runtime.JAVA);
        functionConfig.setOutput("avro_user_tap");

        LocalRunner localRunner = LocalRunner.builder().functionConfig(functionConfig).build();
        localRunner.start(false);
    }
}