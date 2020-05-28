package com.qiumuzi.VisualizeSong.Service.Impl;

import com.qiumuzi.VisualizeSong.Mapper.PhotoMapper;
import com.qiumuzi.VisualizeSong.Model.Photo;
import com.qiumuzi.VisualizeSong.Model.PhotoExample;
import com.qiumuzi.VisualizeSong.RedisClient;
import io.redisearch.Document;
import io.redisearch.Query;
import io.redisearch.SearchResult;
import io.redisearch.client.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhotoServiceImpl {

    @Resource
    private PhotoMapper photoMapper;
    @Resource
    private Client client;
    @Resource
    private Jedis jedis;

    public List<Photo> getUploadedPhotoList(Long userId) {
        PhotoExample photoExample = new PhotoExample();
        PhotoExample.Criteria criteria = photoExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        return photoMapper.selectByExample(photoExample);
    }


    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }
    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
        return template;
    }

    public String uploadPhoto(Photo photo) {
        photoMapper.insert(photo);

        client = RedisClient.initialize();



        Map<String, Object> fields = new HashMap<>();
        fields.put("tag", photo.getTags());
        fields.put("photoId", photo.getId());
        fields.put("frequency", 0);


        client.addDocument(String.valueOf(photo.getId()), fields);

        return "upload successful!";
    }

    public void usePhoto(Long photoId) {
        Document document = getDocumentByPhotoId(photoId);

        Map<String, Object> newProperties = new HashMap<>();
        for (Map.Entry<String, Object> entry : document.getProperties()) {
            if (entry.getKey().equals("frequency")) {
                entry.setValue((int) entry.getValue() + 1);
            }
            newProperties.put(entry.getKey(), entry.getValue());
        }

    client.replaceDocument(String.valueOf(photoId), 0.0, newProperties);
    }

    public List<Document> getPhotoFromTags(String tags) {
        Query query = new Query(tags);
        query.setSortBy("frequency",false);
        SearchResult res = client.search(query);
        return res.docs;
    }

    public Document getDocumentByPhotoId(Long photoId) {
        return client.getDocument(String.valueOf(photoId));
    }
}
