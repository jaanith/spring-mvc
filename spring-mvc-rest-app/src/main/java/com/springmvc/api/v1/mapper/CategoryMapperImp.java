package com.springmvc.api.v1.mapper;

import com.springmvc.api.v1.model.CategoryDTO;
import com.springmvc.domain.Category;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class CategoryMapperImp implements CategoryMapper {
    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        if (category == null) {
            return categoryDTO;
        }
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }
}
