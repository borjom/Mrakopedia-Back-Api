package ru.mrakopedia.story;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mrakopedia.web.ResponseView;

import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public String getStories() {
        String response = null;

        try {
            List<Story> stories = storyRepository.findAll();
            response = objectMapper.writerWithView(ResponseView.StoryView.class).writeValueAsString(stories);
        } catch (Exception e) {
        }

        return response;
    }

    public String getStory(Long id) {
        String response = null;

        try {
            Story story = storyRepository.findOne(id);
            response = objectMapper.writerWithView(ResponseView.StoryView.class).writeValueAsString(story);
        } catch (Exception e) {
        }

        return response;
    }

}
