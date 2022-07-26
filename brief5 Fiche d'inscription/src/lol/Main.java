package lol;

public class Main {

		public static void main(String[] args) {
		System.out.println("LOL!");
		UserDao userDao =  new UserDao();	

		///// INSERT user ////////////
		//User UserInsert = new User(22, "makhloufi","anas","anasdr@gmail.com","rabat wifaq n 340","Ratab","Morocco"); 
		//System.out.println(userDao.insertCandidate(UserInsert));
		

		 
			/////////// UPDATE user ///////////////
			//User userUpdate = new User(22, "mak","anas","anasdr@gmail.com","rabat wifaq n 340","Ratab","Morocco"); 
			//System.out.println(userDao.updateCandidate(22, userUpdate));
        
		
      
			/////////// delete user ///////////////
//	    	User userUpdate = new User(22, "mak","anas","anasdr@gmail.com","rabat wifaq n 340","Ratab","Morocco"); 
//        System.out.println(userDao.deleteCandidate(22));

        
        
        /////// Get user /////////
		System.out.println(userDao.getCandiate(4));

              
	    
	}

}
