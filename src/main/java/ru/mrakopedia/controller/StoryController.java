package ru.mrakopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mrakopedia.story.StoryService;

/**
 * Created by Svin on 22.04.2017.
 */

@RestController
@RequestMapping("/api")
public class StoryController {

    @Autowired
    private StoryService storyService;


    @RequestMapping(value = "/stories")
    public String getStories() {
        return storyService.getStories();
    }

    @RequestMapping(value = "/story")
    public String getStory(@RequestParam Long id) {
        return storyService.getStory(id);
    }
}
