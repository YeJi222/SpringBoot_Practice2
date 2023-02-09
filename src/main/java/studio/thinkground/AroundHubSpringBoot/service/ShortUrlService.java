package studio.thinkground.AroundHubSpringBoot.service;

import studio.thinkground.AroundHubSpringBoot.data.dto.ShortUrlResponseDto;

public interface ShortUrlService {
    ShortUrlResponseDto getShortUrl(String clientId, String clientSecret, String originalUrl);

    ShortUrlResponseDto generateShortUrl(String clientId, String clientSecret, String originalUrl);

    ShortUrlResponseDto updateShortUrl(String clientId, String clientSecret, String originalUrl);

    ShortUrlResponseDto deleteShortUrl(String url);

    ShortUrlResponseDto deleteByOriginalUrl(String originalUrl);
}