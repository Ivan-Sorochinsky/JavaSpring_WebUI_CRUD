package ru.sorochinsky.javaspring_webui_crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorochinsky.javaspring_webui_crud.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
