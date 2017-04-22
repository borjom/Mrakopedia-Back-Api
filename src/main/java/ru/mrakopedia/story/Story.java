package ru.mrakopedia.story;

import lombok.Getter;
import lombok.Setter;
import ru.mrakopedia.category.Category;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToMany
    private List<Category> categories;
}
