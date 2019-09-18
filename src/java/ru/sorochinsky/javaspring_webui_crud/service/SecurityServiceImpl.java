package ru.sorochinsky.javaspring_webui_crud.service;

import org.springframework.stereotype.Service;


/**
 * Implementation of {@link SecurityService} interface.
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

@Service
public class SecurityServiceImpl implements SecurityService {
    @Override
    public String findLoggedInUsername() {
        return null;
    }

    @Override
    public void autoLogin(String username, String password) {

    }
}
