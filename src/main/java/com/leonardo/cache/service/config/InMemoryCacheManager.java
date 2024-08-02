package com.leonardo.cache.service.config;

import com.leonardo.cache.service.config.caffeine.CustomCaffeineCacheManager;
import org.springframework.cache.CacheManager;

public interface InMemoryCacheManager {

    default CacheManager inMemoryCacheManager() {
        return new CustomCaffeineCacheManager();
    }
}
