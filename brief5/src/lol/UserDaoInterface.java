package lol;

import java.util.Set;

public interface UserDaoInterface {
		
	  Set<User> getAllUser();
	  boolean insertCandidate(User user);
	  User getCandiate(int id);
	  boolean updateCandidate(int id, User user);
	  boolean deleteCandidate(int id);
	  
}
