package co.johnsasn.market.persistence.crud;

import co.johnsasn.market.persistence.entity.ProductDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductDTO, Integer> {

    List<ProductDTO> findByCategoryIdOrderByNameAsc(int categoryId);

    Optional<List<ProductDTO>> findByStockLessThanAndStatus(int stock, boolean status);
}
