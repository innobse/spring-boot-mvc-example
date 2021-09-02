package ru.bse71.learnup.spring.boot.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 2:32
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private String text;
}
