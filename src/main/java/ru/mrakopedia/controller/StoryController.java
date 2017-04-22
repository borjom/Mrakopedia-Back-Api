package ru.mrakopedia.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mrakopedia.story.Story;
import ru.mrakopedia.story.StoryService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@RestController
@RequestMapping("/api")
public class StoryController {

    @Autowired
    private StoryService storyService;


    @RequestMapping(value = "/stories")
    public List<Story> getStories() {
        return storyService.getStories();
    }

    @RequestMapping(value = "/add")
    public void addStory(@RequestParam String title) {
        storyService.addStory(title);
    }

    @RequestMapping(value = "/story")
    public Story getStory(@RequestParam Long id) {
        return storyService.getStory(id);
    }
}
