package ru.bse71.learnup.spring.boot.mvc.repository.interfaces;

import ru.bse71.learnup.spring.boot.mvc.model.Post;

import java.util.Collection;
import java.util.List;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 2:31
 */

public interface PostRepository {

    Collection<Post> getAllPosts();
    Post getOne(int id);
}
