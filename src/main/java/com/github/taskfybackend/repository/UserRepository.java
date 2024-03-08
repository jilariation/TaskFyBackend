package com.github.taskfybackend.repository;

import com.github.taskfybackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Находит всех пользователей по их имени
     * @param username Имя пользователя
     * @return Возвращает либо null, либо {@link User}
     */
    Optional<User> findByUsername(String username);

    /**
     * Проверяет наличие пользователя с таким именем
     * @param username Имя пользователя
     * @return Возвращает true или false в зависимости от ответа
     */
    boolean existsByUsername(String username);

    /**
     * Проверяет наличие пользователя с такой почтой
     * @param email Почта пользователя
     * @return Возвращает true или false в зависимости от ответа
     */
    boolean existsByEmail(String email);
}
