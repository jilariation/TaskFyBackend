package com.github.taskfybackend.service;

import com.github.taskfybackend.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    /**
     * Сохранение пользователя
     */
    public void save(User user);

    /**
     * Создание пользователя
     */
    public void create(User user);

    /**
     * Получение пользователя по имени пользователя
     *
     * @return пользователь
     */
    public User getByUsername(String username);

    /**
     * Получение пользователя по имени пользователя
     * <p>
     * Нужен для Spring Security
     *
     * @return пользователь
     */
    public UserDetailsService userDetailsService();

    /**
     * Получение текущего пользователя
     *
     * @return текущий пользователь
     */
    public User getCurrentUser();

    /**
     * Выдача прав администратора текущему пользователю
     * <p>
     * Нужен для демонстрации
     */
    @Deprecated
    public void getAdmin();
}
