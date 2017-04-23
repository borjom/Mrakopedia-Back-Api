package ru.mrakopedia.story;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import ru.mrakopedia.category.Category;
import ru.mrakopedia.web.ResponseView;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@Entity
@Getter
@Setter
@Table(name = "story")
public class Story {

    @JsonView(value = {ResponseView.StoryView.class, ResponseView.CategoryView.class})
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonView(value = {ResponseView.StoryView.class, ResponseView.CategoryView.class})
    private String title;

    @JsonView(value = {ResponseView.StoryView.class})
    @ManyToMany
    private List<Category> categories;
}
