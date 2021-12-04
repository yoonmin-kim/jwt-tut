package com.hello.jwttut.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.jwttut.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
