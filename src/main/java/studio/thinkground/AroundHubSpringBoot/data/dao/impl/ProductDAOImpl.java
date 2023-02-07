package studio.thinkground.AroundHubSpringBoot.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.thinkground.AroundHubSpringBoot.data.dao.ProductDAO;
import studio.thinkground.AroundHubSpringBoot.data.entity.ProductEntity;
import studio.thinkground.AroundHubSpringBoot.data.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO { // interface를 implements
    ProductRepository productRepository;

    @Autowired // 자동으로 연결시켜준다는 의미 - 미리 띄워져 있는 repository를 끌어와서 사용
    public ProductDAOImpl(ProductRepository productRepository) { // 생성자
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity); // db에 저장된다
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        // id를 기반으로 데이터를 가져온다
        // productId를 넘겨주고 productEntity를 받아온다
        ProductEntity productEntity = productRepository.getById(productId);
        return productEntity;
    }
}
