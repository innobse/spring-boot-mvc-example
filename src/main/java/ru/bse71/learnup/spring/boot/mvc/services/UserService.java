package ru.bse71.learnup.spring.boot.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.mvc.model.User;
import ru.bse71.learnup.spring.boot.mvc.repository.interfaces.UserRepository;

/**
 * Created by bse71
 * Date: 08.09.2021
 * Time: 2:06
 */

@Component
public class UserService implements UserDetailsService {

    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = repository.getByLogin(username);
        if (user == null) throw new UsernameNotFoundException("User not found");
        return user;
    }
}
