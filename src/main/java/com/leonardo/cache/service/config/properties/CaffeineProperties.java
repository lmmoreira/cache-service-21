package com.leonardo.cache.service.config.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConditionalOnProperty(prefix = "cache.caffeine", name = "mode", havingValue = "caffeine")
@ConfigurationProperties(prefix = "cache.caffeine")
public record CaffeineProperties(
    String mode) implements CacheProperties {

}
