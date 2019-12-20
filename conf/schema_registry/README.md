1. Start the docker image with the --mount option to bind the schema registry to the instance

* docker run -it -p 6650:6650 -p 8080:8080 -p 2181:2181 -v $PWD/data:/pulsar/data --mount type=bind,source=/Users/shoconnor/IdeaProjects/pulsar/conf/schema_registry,target=/pulsar/schema_registry apachepulsar/pulsar:2.4.0 bin/pulsar standalone
* ssh into the image 
1. docker ps to get the name of the existing container
1. docker exec -it <container name> /bin/bash 
1. 

*Inside the image upload a schema to the registry
1. bin/pulsar-admin schemas upload public/default/topic_name --filename path_to_conf/temp_reading.conf

*To view the schema :
1. bin/pulsar-admin schemas get public/default/topic_name

