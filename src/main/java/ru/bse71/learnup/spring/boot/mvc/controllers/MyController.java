package ru.bse71.learnup.spring.boot.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
}
