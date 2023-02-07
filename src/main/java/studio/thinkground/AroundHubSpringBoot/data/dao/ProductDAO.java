package studio.thinkground.AroundHubSpringBoot.data.dao;

import studio.thinkground.AroundHubSpringBoot.data.entity.ProductEntity;

public interface ProductDAO {
    // interface의 경우는 구체화된 코드가 들어가지 않기 때문에 메소드를 선언만 해준다
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);
}
