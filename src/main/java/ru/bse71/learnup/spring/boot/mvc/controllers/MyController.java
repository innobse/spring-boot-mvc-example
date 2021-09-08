package ru.bse71.learnup.spring.boot.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.bse71.learnup.spring.boot.mvc.model.Post;
import ru.bse71.learnup.spring.boot.mvc.services.PostService;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 1:21
 */

@Controller
public class MyController {

    private PostService service;

    @Autowired
    public MyController(PostService service) {
        this.service = service;
    }

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String getAllPostsWithView(@RequestParam("view") @Nullable String view, Model model) {
        model.addAttribute("postList", service.getAllPosts());
        return view == null ? "list" : view;
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    public String getPost(@PathVariable("id") int id, Model model) {
        model.addAttribute("post", service.get(id));
        return "post";
    }

    @RequestMapping(value = "/post/new", method = RequestMethod.GET)
    public String printForm() {
        return "add-post";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String addPost(@ModelAttribute Post post, Model model) {
        service.add(post);
        return getAllPostsWithView(null, model);
    }
}
