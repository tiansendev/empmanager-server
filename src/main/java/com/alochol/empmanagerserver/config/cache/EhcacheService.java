package com.alochol.empmanagerserver.config.cache;

import com.alibaba.fastjson.JSON;
import org.ehcache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service("ehcacheService")
public class EhcacheService implements CacheService{
    @Autowired
    private Cache defaultCache;

    /**
     * 写入缓存
     * @param key
     * @param value
     * @return
     */
    public <T> boolean set(final String key, T value) {
        boolean result = false;
        try {
            defaultCache.put(key, JSON.toJSONString(value));
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 读取缓存
     * @param key
     * @return
     */
    public  <T> T  get(final String key,Class<T> tClass) {
        T result = null;
        try {
            Object obj=defaultCache.get(key);
            if(null!=obj) {
                result = JSON.parseObject(obj.toString(), tClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量删除对应的value
     * @param keys
     */
    public void remove(final String... keys) {
        Set<String> keySet = new HashSet<>(Arrays.asList(keys));
        defaultCache.removeAll(keySet);
    }

    /**
     * 判断缓存中是否有对应的value
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return defaultCache.containsKey(key);
    }

}