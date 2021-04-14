package com.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

public class T1 {

    @Test
    public void test1 ()
    {
        // 直连方式
        Jedis jedis = new Jedis("192.168.1.220", 6379);
        jedis.set("name", "gwx");
        jedis.set("age", "30");

        System.out.println(jedis.get("age"));
        jedis.close();
    }

    @Test
    public void test2 ()
    {
        // 连接池方式
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        // 初始化jedis连接池
        JedisPool jedisPool = new JedisPool(poolConfig, "192.168.1.220", 6379);

        // 从jedis连接池获取jedis对象
        Jedis jedis = jedisPool.getResource();

        jedis.rpush("hobby", "basketball", "movie", "music");

        List<String> hobby = jedis.lrange("hobby", 0, -1);

        for (String s : hobby) {
            System.out.println(s);
        }

        // 用完归为池对象
        jedis.close();

    }
}
