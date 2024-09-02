package com.app.blogez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.blogez.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
