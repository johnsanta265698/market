package co.johnsasn.market.persistence.crud;

import co.johnsasn.market.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {


}
