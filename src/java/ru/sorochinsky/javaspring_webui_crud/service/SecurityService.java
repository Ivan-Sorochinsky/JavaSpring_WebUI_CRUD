package ru.sorochinsky.javaspring_webui_crud.service;

/**
 * Service for security.
 *
 * @author Ivan Sorochinsky
 * @version 1.0
 */

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
