package co.johnsasn.market.persistence;

import co.johnsasn.market.domain.Product;
import co.johnsasn.market.domain.repository.IProductRepository;
import co.johnsasn.market.persistence.crud.ProductCrudRepository;
import co.johnsasn.market.persistence.entity.ProductDTO;
import co.johnsasn.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository  implements IProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll(){
        List<ProductDTO> productsDTO = (List<ProductDTO>) productCrudRepository.findAll();
        return productMapper.toProducts(productsDTO);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId){
        List<ProductDTO> productsDTO = productCrudRepository.findByCategoryIdOrderByNameAsc(categoryId);
        return Optional.of(productMapper.toProducts(productsDTO));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<ProductDTO>> productsDTO = productCrudRepository.findByStockLessThanAndStatus(quantity, true);
        return productsDTO.map(products -> productMapper.toProducts(products));
    }

    @Override
    public Optional<Product> getProducts(int productId) {
        return productCrudRepository.findById(productId).map(product -> productMapper.toProduct(product));
    }

    @Override
    public Product save(Product product) {
        ProductDTO productDTO = productMapper.toProductEntity(product);
        return productMapper.toProduct(productCrudRepository.save(productDTO));
    }

    @Override
    public void delete(int productId){
        productCrudRepository.deleteById(productId);
    }
}
