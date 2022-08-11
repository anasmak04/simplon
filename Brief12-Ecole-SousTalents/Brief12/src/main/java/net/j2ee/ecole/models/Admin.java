package net.j2ee.ecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Admin")
public class Admin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_Admin")
		private int id_Admin;
	@Column(name="lastName")
		private String lastName;
	@Column(name="email")
		private String email;
	@Column(name="pwd")
		private String pwd;
		
		public Admin() {
			super();
		}

		public Admin(int id_Admin, String lastName, String email, String pwd) {
			super();
			this.id_Admin = id_Admin;
			this.lastName = lastName;
			this.email = email;
			this.pwd = pwd;
		}

		public int getId_Admin() {
			return id_Admin;
		}

		public void setId_Admin(int id_Admin) {
			this.id_Admin = id_Admin;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		@Override
		public String toString() {
			return "Admin [id_Admin=" + id_Admin + ", lastName=" + lastName + ", email=" + email + ", pwd=" + pwd + "]";
		}		
}
