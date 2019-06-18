

import static org.junit.Assert.*;

import org.junit.Test;

import actionForm.Emp_Login;

public class Emp_LoginTest {

	@Test
	public void usernametest() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setUserName("admin123");
	    		
		assertEquals("admin123",Ad.getUserName());
	}
	
	@Test
	public void passwordtest() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setPassword("admin123");
	    		
		assertEquals("admin123",Ad.getPassword());
	}
	
	@Test
	public void bankidtest() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setBank_id("admin123");
	    		
		assertEquals("admin123",Ad.getBank_id());
	}
	
	@Test
	public void oldpwtest() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setOldpw("admin123");
	    		
		assertEquals("admin123",Ad.getOldpw());
	}
	
	@Test
	public void newpwtest() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setNewpw("admin123");
	    		
		assertEquals("admin123",Ad.getNewpw());
	}
	
	@Test
	public void cnewpwtest() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setCnewpw("admin123");
	    		
		assertEquals("admin123",Ad.getCnewpw());
	}
	
	@Test
	public void test() {
		Emp_Login Ad = new Emp_Login();
		
		Ad.setTest("admin123");
	    		
		assertEquals("admin123",Ad.getTest());
	}


}
