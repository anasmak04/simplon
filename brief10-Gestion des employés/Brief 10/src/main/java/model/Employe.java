package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employe")
public class Employe {
	
	
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="refernce")
    protected String refernce;
	
	 @Column(name="firstname")
	    protected String firstname;
	 
	    @Column(name="lastname")
	    protected String lastname;
	 
	    @Column(name="email")
	    protected String email;
	    
	    @Column(name="adresse")
	    protected String adresse;
	
	    @Column(name="contact")
	    protected String contact;

	    
	    public Employe() {
			
		}
		public Employe(String refernce, String firstname, String lastname, String email, String adresse,
				String contact) {
			super();
			this.refernce = refernce;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.adresse = adresse;
			this.contact = contact;
		}
		public String getRefernce() {
			return refernce;
		}
		public void setRefernce(String refernce) {
			this.refernce = refernce;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
	    
		
		
	    
}
