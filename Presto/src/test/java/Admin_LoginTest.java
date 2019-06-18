

import static org.junit.Assert.*;

import org.junit.Test;
import actionForm.Admin_Login;

public class Admin_LoginTest {

	@Test
	public void usernametest() {
   Admin_Login Ad = new Admin_Login();
		
		Ad.setUserName("admin");
	    		
		assertEquals("admin",Ad.getUserName());
	}
	
	@Test
	public void bankidtest() {
		Admin_Login Ad = new Admin_Login();
		
		Ad.setBank_id("1234");
	    		
		assertEquals("1234",Ad.getBank_id());
	}
	
	@Test
	public void passwordtest() {
		Admin_Login Ad = new Admin_Login();
		
		Ad.setPassword("admin123");
	    		
		assertEquals("admin123",Ad.getPassword());
	}
  
	@Test
	public void newpwtest() {
		Admin_Login Ad = new Admin_Login();
		
		Ad.setNewpw("admin123");
	    		
		assertEquals("admin123",Ad.getNewpw());
	}
	
	@Test
	public void Cnewpwtest() {
		Admin_Login Ad = new Admin_Login();
		
		Ad.setCnewpw("admin123");
	    		
		assertEquals("admin123",Ad.getCnewpw());
	}
	
	@Test
	public void test() {
		Admin_Login Ad = new Admin_Login();
		
		Ad.setTest("123");
	    		
		assertEquals("123",Ad.getTest());
	}
   
	@Test
	public void oldpwtest() {
		Admin_Login Ad = new Admin_Login();
		
		Ad.setOldpw("123");
	    		
		assertEquals("123",Ad.getOldpw());
	}

}
