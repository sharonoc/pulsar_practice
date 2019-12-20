Install protoc
* https://github.com/protocolbuffers/protobuf/blob/master/README.md

This page has language specific links for maven and gradel configs
* https://github.com/protocolbuffers/protobuf

Language specific tutorials:
* https://developers.google.com/protocol-buffers/docs/tutorials

Example of how to generate proto file:
* protoc -I=/Users/shoconnor/IdeaProjects/pulsar/src/main/java/ --java_out=/Users/shoconnor/IdeaProjects/pulsar/src/main/java/ /Users/shoconnor/IdeaProjects/pulsar/src/main/java/protos/sensor_reading.proto