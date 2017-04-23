package ru.mrakopedia.category;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mrakopedia.web.ResponseView;

import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public String getCategories() {
        String response = null;

        try {
            List<Category> categories = categoryRepository.findAll();
            response = objectMapper.writerWithView(ResponseView.CategoryView.class).writeValueAsString(categories);

        } catch (Exception e) {
        }

        return response;
    }

    public String getCategoryById(Long id) {
        String response = null;

        try {
            Category category = categoryRepository.findOne(id);
            response = objectMapper.writerWithView(ResponseView.CategoryView.class).writeValueAsString(category);
        } catch (Exception e) {
        }

        return response;
    }
}
