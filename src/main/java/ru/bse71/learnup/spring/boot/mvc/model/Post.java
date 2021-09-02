package ru.bse71.learnup.spring.boot.mvc.model;

import lombok.Data;

import java.util.List;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 2:32
 */

@Data
public class Post {

    private final int id;
    private final String title;
    private final String text;
    private final List<Comment> comments;
}
