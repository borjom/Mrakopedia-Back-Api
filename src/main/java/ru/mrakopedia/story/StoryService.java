package ru.mrakopedia.story;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;

    public List<Story> getStories() {
        return storyRepository.findAll();
    }

    public Story getStory(Long id) {
        return storyRepository.getOne(id);
    }

    public void addStory(String title) {
        Story story = new Story();
        story.setTitle(title);
        storyRepository.save(story);
    }

}
