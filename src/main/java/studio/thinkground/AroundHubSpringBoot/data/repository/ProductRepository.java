package studio.thinkground.AroundHubSpringBoot.data.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.AroundHubSpringBoot.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> { // String : primary key의 datatype
    /* 쿼리 메소드의 주제 키워드 */

    // 조회
    List<ProductEntity> findByName(String name);
    List<ProductEntity> queryByName(String name);

    // 존재 유무
    boolean existsByName(String name);

    // 쿼리 결과 개수
    long countByName(String name);

    // 삭제
    void deleteByName(String name);
    long removeByName(String name);

    // 값 개수 제한
    List<ProductEntity> findFirst5ByName(String name);
    List<ProductEntity> findTop3ByName(String name);

    /* 쿼리 메소드의 조건자 키워드 */

    // Is, Equals (생략 가능)
    // Logical Keyword : IS , Keyword Expressions : Is, Equals, (or no keyword)
    // findByNumber 메소드와 동일하게 동작
    ProductEntity findByIdIs(String id);
    ProductEntity findByIdEquals(String id);

    // (Is)Not
    List<ProductEntity> findByIdNot(String id);
    List<ProductEntity> findByIdIsNot(String id);

    // (Is)Null, (Is)NotNull
    List<ProductEntity> findByStockIsNull();
    List<ProductEntity> findByStockIsNotNull();

    // And, Or
    List<ProductEntity> findTopByIdAndName(String id, String name);

    // (Is)GreaterThan, (Is)LessThan, (Is)Between
    List<ProductEntity> findByPriceGreaterThan(Integer price);

    // (Is)Like, (Is)Containing, (Is)StartingWith, (Is)EndingWith
    List<ProductEntity> findByNameContaining(String name);


    /* 정렬과 페이징

    // Asc : 오름차순, Desc : 내림차순
    List<ProductEntity> findByNameContainingOrderByStockAsc(String name);
    List<ProductEntity> findByNameContainingOrderByStockDesc(String name);

    // 여러 정렬 기준 사용
    List<ProductEntity> findByNameContainingOrderByPriceAscStockDesc(String name);

    // 매개변수를 활용한 정렬
    List<ProductEntity> findByNameContaining(String name, Sort sort);

    // 페이징 처리하기
    List<ProductEntity> findByPriceGreaterThan(Integer price, Pageable pageable);

     */


    /* @Query 사용하기

    @Query("SELECT p FROM Product p WHERE p.price > 2000")
    List<ProductEntity> findByPriceBasis();

    @Query(value = "SELECT * FROM product p WHERE p.price > 2000", nativeQuery = true)
    List<ProductEntity> findByPriceBasisNativeQuery();

    @Query("SELECT p FROM Product p WHERE p.price > ?1")
    List<ProductEntity> findByPriceWithParameter(Integer price);

    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<ProductEntity> findByPriceWithParameterNaming(Integer price);

    @Query("SELECT p FROM Product p WHERE p.price > :pri")
    List<ProductEntity> findByPriceWithParameterNaming2(@Param("pri") Integer price);

    @Query(value = "SELECT * FROM product WHERE price > :price",
        countQuery = "SELECT count(*) FROM product WHERE price > ?1",
        nativeQuery = true)
    List<ProductEntity> findByPriceWithParameterPaging(Integer price, Pageable pageable);

     */

}
