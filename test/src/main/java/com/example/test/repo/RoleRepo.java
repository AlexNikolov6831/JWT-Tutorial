package com.example.test.repo;

import com.example.test.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
        Role findByUsername(String username);
}
