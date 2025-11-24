package com.pepsico.sb.repository;

import com.pepsico.sb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}