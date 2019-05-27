package com.events.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KafkaMessageDao {

    @Autowired
    private CassandraTemplate cassandraTemplate;

    public void save(KafkaMessageBean bean){
        cassandraTemplate.insert(bean);
    }

}
