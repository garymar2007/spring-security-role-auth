package com.gary.springsecurity.repository;

import com.gary.springsecurity.entity.Role;
import com.gary.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(String Name);
}
