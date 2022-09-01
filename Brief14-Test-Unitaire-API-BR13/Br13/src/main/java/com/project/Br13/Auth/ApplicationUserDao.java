package com.project.Br13.Auth;

import com.google.common.base.Optional;

import org.springframework.context.annotation.Bean;


public interface ApplicationUserDao {

	Optional<ApplicationUser> SelectApplicationByusername(String username);
}
