package co.johnsasn.market.persistence;

import co.johnsasn.market.persistence.crud.ProductCrudRepository;
import co.johnsasn.market.persistence.entity.Product;

import java.util.List;

public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }
}
