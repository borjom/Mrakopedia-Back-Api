package ru.mrakopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mrakopedia.category.CategoryService;

/**
 * Created by Svin on 22.04.2017.
 */

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories")
    public String getCategories() {
        return categoryService.getCategories();
    }

    @RequestMapping(value = "/category")
    public String getCategory(@RequestParam Long id) {
        return categoryService.getCategoryById(id);
    }
}
