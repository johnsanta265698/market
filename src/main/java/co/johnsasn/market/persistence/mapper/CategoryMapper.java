package co.johnsasn.market.persistence.mapper;

import co.johnsasn.market.domain.Category;
import co.johnsasn.market.persistence.entity.CategoryDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {


    @Mapping(source = "idCategory", target = "categoryId")
    @Mapping(source = "description", target = "category")
    @Mapping(source = "status", target = "active")
    Category toCategory(CategoryDTO categoryEntity);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    CategoryDTO toCategoryEntity(co.johnsasn.market.domain.Category category);
}
