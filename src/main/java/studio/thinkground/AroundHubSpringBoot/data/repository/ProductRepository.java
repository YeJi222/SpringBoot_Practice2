package studio.thinkground.AroundHubSpringBoot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.AroundHubSpringBoot.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> { // String : primary key의 datatype

}
