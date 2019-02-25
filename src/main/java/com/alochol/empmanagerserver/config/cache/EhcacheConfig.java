package com.alochol.empmanagerserver.config.cache;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.config.units.EntryUnit;
import org.ehcache.config.units.MemoryUnit;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class EhcacheConfig {
    private final static String defaultCache="defaultCache";
    @Bean(name="defaultCache")
    public Cache defaultCache() {
        CacheConfiguration ccf= CacheConfigurationBuilder.newCacheConfigurationBuilder(
                String.class, String.class,
                ResourcePoolsBuilder
                        .newResourcePoolsBuilder()
                        .heap(5L,EntryUnit.ENTRIES)
                        .offheap(2L, MemoryUnit.MB)
                        .disk(3L, MemoryUnit.MB, false))
                .build();
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
                // 硬盘持久化地址
                .with(CacheManagerBuilder.persistence("C:/ehcacheData"))
                //创建之后立即初始化
                .build(true);
        return cacheManager.createCache(defaultCache,ccf);
    }
}

