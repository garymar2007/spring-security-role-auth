package com.gary.springsecurity.repository;

import com.gary.springsecurity.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrivilegeRepository extends JpaRepository<Privilege,Integer> {
    Optional<Privilege> findByName(String name);
}
