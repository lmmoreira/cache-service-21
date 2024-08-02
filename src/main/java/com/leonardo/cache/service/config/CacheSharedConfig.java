package com.leonardo.cache.service.config;

import com.leonardo.cache.service.CacheServiceFactory;
import com.leonardo.cache.service.CaffeineCacheService;
import com.leonardo.cache.service.MemCachedCacheService;
import com.leonardo.cache.service.RedisCacheService;
import com.leonardo.cache.service.config.caffeine.CaffeineCacheConfig;
import com.leonardo.cache.service.config.memcached.MemcachedCacheConfig;
import com.leonardo.cache.service.config.redis.RedisCacheConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({
    CaffeineCacheConfig.class,
    MemcachedCacheConfig.class,
    RedisCacheConfig.class,
    CacheServiceFactory.class,
    CaffeineCacheService.class,
    MemCachedCacheService.class,
    RedisCacheService.class

})
public class CacheSharedConfig {

}
