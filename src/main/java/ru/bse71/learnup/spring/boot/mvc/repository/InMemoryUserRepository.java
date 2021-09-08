package ru.bse71.learnup.spring.boot.mvc.repository;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import ru.bse71.learnup.spring.boot.mvc.model.User;
import ru.bse71.learnup.spring.boot.mvc.repository.interfaces.UserRepository;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by bse71
 * Date: 08.09.2021
 * Time: 2:12
 */

@Component
public class InMemoryUserRepository implements UserRepository {

    private final Map<String, User> storage = new HashMap<>();

    @PostConstruct
    public void init() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        storage.put(
                "user",
                new User(
                        "user",
                        encoder.encode("user123"),
                        Collections.singletonList(
                                new SimpleGrantedAuthority("ROLE_USER"))));
        storage.put(
                "admin",
                new User(
                        "admin",
                        encoder.encode("admin123"),
                        asList(
                                new SimpleGrantedAuthority("ROLE_USER"),
                                new SimpleGrantedAuthority("ROLE_ADMIN"))));
    }

    @Override
    public User getByLogin(String login) {
        return storage.get(login);
    }
}
