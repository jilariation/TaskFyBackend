package com.github.taskfybackend.service;

import com.github.taskfybackend.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    /**
     * Сохранение пользователя
     */
    void insert(User user);

    /**
     * Создание пользователя
     */
    void create(User user);

    /**
     * Получение пользователя по имени пользователя
     *
     * @return пользователь
     */
    User getByUsername(String username);

    /**
     * Получение пользователя по имени пользователя
     * <p>
     * Нужен для Spring Security
     *
     * @return пользователь
     */
    UserDetailsService userDetailsService();
}
