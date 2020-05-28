package com.qiumuzi.VisualizeSong;

import io.redisearch.Schema;
import io.redisearch.client.Client;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

public class RedisClient {

    @Bean
    public static Client initialize() {
        Client client = new Client("testung", "localhost", 6379);

        initializePhotoSchema(client);

        return client;
    }

    public static void initializePhotoSchema(Client client) {
        Schema sc = new Schema()
                .addTextField("tag", 5.0)
                .addNumericField("photoId")
                .addNumericField("frequency");

        client.createIndex(sc, Client.IndexOptions.Default());
    }
}
