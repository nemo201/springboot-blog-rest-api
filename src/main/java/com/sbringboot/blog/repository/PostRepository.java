package com.sbringboot.blog.repository;

import com.sbringboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    //JpaRepo already contains codes for all the crud operations hence we dont need to write them again
    // we do not need to add @Repository anno to PstRepository interface as Jpa has them added internally
}
