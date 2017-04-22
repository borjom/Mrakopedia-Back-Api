package ru.mrakopedia.story;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Svin on 22.04.2017.
 */

@Entity
@Table(name = "story")
@Getter
@Setter
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

}
