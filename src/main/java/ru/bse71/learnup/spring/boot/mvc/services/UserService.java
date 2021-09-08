package ru.bse71.learnup.spring.boot.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.mvc.model.User;
import ru.bse71.learnup.spring.boot.mvc.repository.interfaces.PostRepository;
import ru.bse71.learnup.spring.boot.mvc.repository.interfaces.UserRepository;

/**
 * Created by bse71
 * Date: 08.09.2021
 * Time: 2:06
 */

@Component
public class UserService {

    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User searchByLoginAndPass(String login, String pass) {
        final User byLogin = repository.getByLogin(login);
        return (byLogin.getPass().equals(pass)) ? byLogin : null;
    }
}
