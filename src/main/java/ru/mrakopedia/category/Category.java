package ru.mrakopedia.category;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import ru.mrakopedia.story.Story;
import ru.mrakopedia.web.ResponseView;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Svin on 22.04.2017.
 */

@Entity
@Getter
@Setter
@Table(name = "category")
public class Category {

    @JsonView(value = {ResponseView.StoryView.class, ResponseView.CategoryView.class})
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonView(value = {ResponseView.StoryView.class, ResponseView.CategoryView.class})
    private String title;

    @JsonView(value = {ResponseView.CategoryView.class})
    @ManyToMany(mappedBy = "categories")
    private List<Story> stories;
}
