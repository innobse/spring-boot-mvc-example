package ru.bse71.learnup.spring.boot.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bse71.learnup.spring.boot.mvc.model.Post;
import ru.bse71.learnup.spring.boot.mvc.repository.interfaces.PostRepository;

import java.util.Collection;
import java.util.List;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 2:29
 */

@Service
public class PostService {

    private PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Collection<Post> getAllPosts() {
        return repository.getAllPosts();
    }

    public Post get(int id) {
        return repository.getOne(id);
    }
}
