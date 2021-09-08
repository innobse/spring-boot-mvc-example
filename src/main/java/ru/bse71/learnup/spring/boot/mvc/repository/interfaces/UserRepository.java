package ru.bse71.learnup.spring.boot.mvc.repository.interfaces;

import ru.bse71.learnup.spring.boot.mvc.model.User;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 2:31
 */

public interface UserRepository {

    User getByLogin(String login);
}
