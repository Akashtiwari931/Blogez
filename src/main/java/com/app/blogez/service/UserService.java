package com.app.blogez.service;

import com.app.blogez.dto.RegistrationDto;
import com.app.blogez.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
