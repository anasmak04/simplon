package com.example.PR11.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class users {
	 	@Id
	    @Column(name = "user_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	@Column(name="username")
	 	  private String username;
	 	@Column(name="password")
	    private String password;
	 	@Column(name="role")
	    private String role;
	 	@Column(name="enabled")
	    private boolean enabled;
		public users(Long id, String username, String password, String role, boolean enabled) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.role = role;
			this.enabled = enabled;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
	 	
	 	
	 
}
