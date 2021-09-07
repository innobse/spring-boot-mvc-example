package ru.bse71.learnup.spring.boot.mvc.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by bse71
 * Date: 08.09.2021
 * Time: 1:51
 */

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = String.valueOf(authentication.getCredentials());

        if ("user".equals(name) && "pass".equals(password)) {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("USER"));
            return new UsernamePasswordAuthenticationToken(
                    name, password, authorities);
        } else throw new BadCredentialsException("Incorrect credentials");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
