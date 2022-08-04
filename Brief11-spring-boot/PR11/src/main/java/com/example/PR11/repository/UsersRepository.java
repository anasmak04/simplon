package com.example.PR11.repository;

import com.example.PR11.models.users;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<users, Long> {
	@Query("SELECT u FROM users u WHERE u.username = :username")
    public users getUserByUsername(@Param("username") String username);
}
