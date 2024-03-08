package com.github.taskfybackend.service;

import com.github.taskfybackend.model.dto.SignInRequest;
import com.github.taskfybackend.model.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {
    /**
     * Регистрирует пользователя
     * @param request Запрос на регистрацию
     * @return Возвращает строковый ответ в зависимости от результата
     */
    ResponseEntity<String> signUp(SignUpRequest request);

    /**
     * Авторизация пользователя
     * @param request Запрос на авторизацию
     * @return Возвращает строковый ответ в зависимости от результата
     */
    ResponseEntity<String> signIn(SignInRequest request);
}
