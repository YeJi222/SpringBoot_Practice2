package studio.thinkground.AroundHubSpringBoot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.AroundHubSpringBoot.data.entity.ShortUrlEntity;

public interface ShortUrlRepository extends JpaRepository<ShortUrlEntity, Long> {

    ShortUrlEntity findByUrl(String url);

    ShortUrlEntity findByOrgUrl(String originalUrl);

}