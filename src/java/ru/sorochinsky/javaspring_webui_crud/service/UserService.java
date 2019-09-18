package ru.sorochinsky.javaspring_webui_crud.service;

import ru.sorochinsky.javaspring_webui_crud.model.User;

/**
 * Service class for {@link ru.sorochinsky.javaspring_webui_crud.model.User}
 * @author Ivan Sorochinsky
 * @version 1.0
 */
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
