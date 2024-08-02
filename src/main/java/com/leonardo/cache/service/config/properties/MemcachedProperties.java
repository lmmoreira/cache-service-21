package com.leonardo.cache.service.config.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConditionalOnProperty(prefix = "cache.memcached", name = "mode", havingValue = "memcached")
@ConfigurationProperties(prefix = "cache.memcached")
public record MemcachedProperties(
    String mode,
    String host,
    int port,
    int defaultTTL,
    int timeout
) implements CacheProperties {

}
