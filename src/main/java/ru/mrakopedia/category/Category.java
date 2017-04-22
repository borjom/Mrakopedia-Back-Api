package ru.mrakopedia.category;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
