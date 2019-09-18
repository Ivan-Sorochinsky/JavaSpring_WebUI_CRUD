package ru.sorochinsky.javaspring_webui_crud.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorochinsky.javaspring_webui_crud.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
