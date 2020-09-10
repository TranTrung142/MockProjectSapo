package com.hust.baseweb.applications.product.service;

import com.hust.baseweb.applications.product.converter.CategoryConverter;
import com.hust.baseweb.applications.product.entity.Category;
import com.hust.baseweb.applications.product.model.CategoryIM;
import com.hust.baseweb.applications.product.model.GetCategoriesByNameOM;
import com.hust.baseweb.applications.product.repo.CategoryRepo;
import com.hust.baseweb.applications.product.repo.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepo categoryRepo;
    private CategoryConverter categoryConverter;
    private final ProductRepo productRepo;

    @Override
    public Category createCategory(CategoryIM categoryIM) {
        Category category = categoryConverter.toEntity(categoryIM);
        return categoryRepo.save(category);
    }

    @Override
    public Optional<CategoryIM> getCategoryById(UUID id) {
        Category category = categoryRepo.getOne(id);
        CategoryIM categoryDTO = categoryConverter.toIM(category);
        return Optional.of(categoryDTO);
    }

    @Override
    public Category updateCategory(UUID id, CategoryIM categoryIM) {
        Category oldCategory = categoryRepo.getOne(id);
        Category category = categoryConverter.toEntity(categoryIM, oldCategory);
        ;
        categoryRepo.save(category);
        return category;
    }

    @Override
    public String deleteCategory(UUID uuid, Boolean clearAllProduct) {
//    public String deleteCategory(UUID uuid) {
//            productRepo.deleteAllWithCategoryId(uuid);
//            Category category = categoryRepo.getOne(uuid);
//            category.setDeleted(true);
//            categoryRepo.save(category);
        if (clearAllProduct == false) {
            Category category = categoryRepo.getOne(uuid);
            category.setDeleted(true);
            categoryRepo.save(category);
            productRepo.updateCategoryIdOfDeletedOne(uuid);
        }
        if (clearAllProduct == true) {
            Category category = categoryRepo.getOne(uuid);
            category.setDeleted(true);
            categoryRepo.save(category);
            productRepo.deleteAllWithCategoryId(uuid);
        }
        return "Deleted";
    }

    @Override
    public Page<GetCategoriesByNameOM> getAllCategoriesByName(String name, Integer page, Integer limit) {
        Page<GetCategoriesByNameOM> categories = categoryRepo.getAllCategoriesByName(name, PageRequest.of(page, limit,
                Sort.by(Sort.Direction.DESC, "last_updated_stamp")));

        return categories;
    }
}
