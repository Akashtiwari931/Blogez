package com.app.blogez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.blogez.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
