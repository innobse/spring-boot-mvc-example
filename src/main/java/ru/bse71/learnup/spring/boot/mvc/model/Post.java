package ru.bse71.learnup.spring.boot.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 2:32
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private int id;
    private String title;
    private String text;
    private List<Comment> comments;
}
