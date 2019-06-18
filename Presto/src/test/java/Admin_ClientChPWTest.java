

import static org.junit.Assert.*;

import org.junit.Test;
import actionForm.Admin_ClientChPW;

public class Admin_ClientChPWTest {

	@Test
	public void usernametest() {
   Admin_ClientChPW Ad = new Admin_ClientChPW();
		
		Ad.setUserName("admin");
	    		
		assertEquals("admin",Ad.getUserName());
	}
	
	@Test
	public void bankidtest() {
   Admin_ClientChPW Ad = new Admin_ClientChPW();
		
		Ad.setBank_id("1234");
	    		
		assertEquals("1234",Ad.getBank_id());
	}
	
	@Test
	public void passwordtest() {
   Admin_ClientChPW Ad = new Admin_ClientChPW();
		
		Ad.setPassword("admin123");
	    		
		assertEquals("admin123",Ad.getPassword());
	}
  
	@Test
	public void newpwtest() {
   Admin_ClientChPW Ad = new Admin_ClientChPW();
		
		Ad.setNewpw("admin123");
	    		
		assertEquals("admin123",Ad.getNewpw());
	}
	
	@Test
	public void Cnewpwtest() {
   Admin_ClientChPW Ad = new Admin_ClientChPW();
		
		Ad.setCnewpw("admin123");
	    		
		assertEquals("admin123",Ad.getCnewpw());
	}
	
	@Test
	public void test() {
   Admin_ClientChPW Ad = new Admin_ClientChPW();
		
		Ad.setTest("123");
	    		
		assertEquals("123",Ad.getTest());
	}
}
