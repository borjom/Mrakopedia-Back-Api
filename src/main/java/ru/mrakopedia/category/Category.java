package ru.mrakopedia.category;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import ru.mrakopedia.story.Story;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "categories")
    private List<Story> stories;
}
