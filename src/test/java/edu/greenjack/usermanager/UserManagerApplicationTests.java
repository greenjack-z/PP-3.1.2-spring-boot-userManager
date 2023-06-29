package edu.greenjack.usermanager;

import edu.greenjack.usermanager.dao.UsersDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserManagerApplicationTests {
	@Autowired
	UsersDao usersDao;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(usersDao);
	}

}
