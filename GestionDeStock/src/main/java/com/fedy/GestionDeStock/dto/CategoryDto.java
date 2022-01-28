package com.fedy.GestionDeStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fedy.GestionDeStock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoryDto {
    private String code;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if (category == null){
            return null;
        }
        return CategoryDto.builder()
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }
    public Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
        }
        Category category = new Category();
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;
    }
}