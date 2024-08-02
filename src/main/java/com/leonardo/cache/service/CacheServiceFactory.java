package com.leonardo.cache.service;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CacheServiceFactory  {

    private final Map<String, CacheService> cacheServiceMap;

    public CacheService getCacheService(String cacheServiceType) {
        return cacheServiceMap.get(cacheServiceType);
    }

}
