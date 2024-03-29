package ru.sorochinsky.javaspring_webui_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.sorochinsky.javaspring_webui_crud.dao.UserDao;
import ru.sorochinsky.javaspring_webui_crud.model.Role;
import ru.sorochinsky.javaspring_webui_crud.model.User;

import java.util.HashSet;
import java.util.Set;


/**
 * Implementation of {@link org.springframework.security.core.userdetails.UserDetailsService} interface.
 * @author Ivan Sorochinsky
 * @version 1.0
 */

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        for (Role role : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
