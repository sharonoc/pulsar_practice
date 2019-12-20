The example producer and consumer in this package are based on the schema_registry file 'auto.conf'
* Before running the producer or consumer upload the schema, this will create the schema in the topic but
the topic, and the corresponding table, will not be visible until the producer is run.

* bin/pulsar-admin schemas upload public/default/auto_data --filename ~/IdeaProjects/pulsar/conf/schema_registry//auto.conf

You can verify that the schema has been created
* bin/pulsar-admin schemas get public/default/auto_data

/*
https://pulsar.apache.org/docs/en/schema-manage/#schema-manual-management
bin/pulsar-admin namespaces set-schema-autoupdate-strategy --disabled public/default
bin/pulsar-admin namespaces set-schema-validation-enforce --enable public/default
*/