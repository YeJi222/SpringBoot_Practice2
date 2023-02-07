package studio.thinkground.AroundHubSpringBoot.data.handler;

import studio.thinkground.AroundHubSpringBoot.data.entity.ProductEntity;

public interface ProductDataHandler {
    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
    ProductEntity getProductEntity(String productId);
}
