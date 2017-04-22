package ru.mrakopedia.story;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Svin on 22.04.2017.
 */

public interface StoryRepository extends JpaRepository<Story, Long> {
}
