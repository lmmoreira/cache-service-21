package com.leonardo.cache.service;

import static com.leonardo.cache.service.config.caffeine.CaffeineCacheConfig.CACHE_MANAGER;

import com.leonardo.cache.service.config.caffeine.CaffeineCacheConfig;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component(CaffeineCacheService.BEAN_ID)
@RequiredArgsConstructor
public class CaffeineCacheService extends AbstractCacheService {

    public static final String BEAN_ID = "caffeineCacheService";

    @Qualifier(CACHE_MANAGER)
    private final Optional<CacheManager> caffeineCacheManager;

    @Override
    public Optional<CacheManager> getCacheManager() {
        return this.caffeineCacheManager;
    }

    @Override
    public String getCacheName() {
        return CaffeineCacheConfig.CACHE_NAME;
    }

}
