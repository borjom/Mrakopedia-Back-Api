package ru.mrakopedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.mrakopedia.category.Category;
import ru.mrakopedia.category.CategoryRepository;
import ru.mrakopedia.story.Story;
import ru.mrakopedia.story.StoryRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    StoryRepository storyRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        Story story = new Story();
        story.setTitle("first Story");

        List<Category> categories = new ArrayList<Category>();

        Category category = new Category();
        category.setTitle("first category");
        category = categoryRepository.saveAndFlush(category);
        categories.add(category);

        story = storyRepository.saveAndFlush(story);
        story.setCategories(categories);
        storyRepository.save(story);
    }
}
