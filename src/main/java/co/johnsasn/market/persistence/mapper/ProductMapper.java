package co.johnsasn.market.persistence.mapper;


import co.johnsasn.market.domain.Product;
import co.johnsasn.market.persistence.entity.ProductDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mapping(source = "productId", target = "productId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "categoryId", target = "categoryId")
    @Mapping(source = "salePrice", target = "salePrice")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "status", target = "active")
    @Mapping(source = "category", target = "category")
    Product toProduct(ProductDTO productEntity);

    List<Product> toProducts(List<ProductDTO> productsEntities);

    @InheritInverseConfiguration
    @Mapping(target = "barcode", ignore = true)
    ProductDTO toProductEntity(Product product);
}
