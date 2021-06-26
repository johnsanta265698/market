package co.johnsasn.market.domain.repository;

import co.johnsasn.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProducts(int productId);
    Product save(Product product);
    void delete(int productId);

}
