//package com.project.Br13.Auth;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.userdetails.*;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ApplicationUserService implements UserDetailsService {
//
//	private final ApplicationUserDao applicationUserDao;
//
//	@Autowired
//	public ApplicationUserService(ApplicationUserDao applicationUserDao) {
//		super();
//		this.applicationUserDao = applicationUserDao;
//	}
//
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		return applicationUserDao.SelectApplicationByusername(username);
////	}
//}
