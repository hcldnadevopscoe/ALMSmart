

import static org.junit.Assert.*;
import actionForm.Admin_EmpChPW;

import org.junit.Test;

public class Admin_EmpChPWTest {

	@Test
	public void usernametest() {
   Admin_EmpChPW Ad = new Admin_EmpChPW();
		
		Ad.setUserName("admin");
	    		
		assertEquals("admin",Ad.getUserName());
	}
	
	@Test
	public void bankidtest() {
		Admin_EmpChPW Ad = new Admin_EmpChPW();
		
		Ad.setBank_id("1234");
	    		
		assertEquals("1234",Ad.getBank_id());
	}
	
	@Test
	public void passwordtest() {
		Admin_EmpChPW Ad = new Admin_EmpChPW();
		
		Ad.setPassword("admin123");
	    		
		assertEquals("admin123",Ad.getPassword());
	}
  
	@Test
	public void newpwtest() {
		Admin_EmpChPW Ad = new Admin_EmpChPW();
		
		Ad.setNewpw("admin123");
	    		
		assertEquals("admin123",Ad.getNewpw());
	}
	
	@Test
	public void Cnewpwtest() {
		Admin_EmpChPW Ad = new Admin_EmpChPW();
		
		Ad.setCnewpw("admin123");
	    		
		assertEquals("admin123",Ad.getCnewpw());
	}
	
	@Test
	public void test() {
		Admin_EmpChPW Ad = new Admin_EmpChPW();
		
		Ad.setTest("123");
	    		
		assertEquals("123",Ad.getTest());
	}
}
