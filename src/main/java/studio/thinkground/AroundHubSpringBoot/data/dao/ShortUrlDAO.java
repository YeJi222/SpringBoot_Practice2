package studio.thinkground.AroundHubSpringBoot.data.dao;

import studio.thinkground.AroundHubSpringBoot.data.entity.ShortUrlEntity;

public interface ShortUrlDAO {

    ShortUrlEntity saveShortUrl(ShortUrlEntity shortUrl);

    ShortUrlEntity getShortUrl(String originalUrl);

    ShortUrlEntity getOriginalUrl(String shortUrl);

    ShortUrlEntity updateShortUrl(ShortUrlEntity newShortUrl);

    void deleteByShortUrl(String shortUrl);

    void deleteByOriginalUrl(String originalUrl);

}