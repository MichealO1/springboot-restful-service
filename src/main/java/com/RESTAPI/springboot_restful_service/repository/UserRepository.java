package com.RESTAPI.springboot_restful_service.repository;

import com.RESTAPI.springboot_restful_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
