package ru.mrakopedia.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findOne(id);
    }

    public void addCategory(String title) {
        Category category = new Category();
        category.setTitle(title);
        categoryRepository.save(category);
    }
}
