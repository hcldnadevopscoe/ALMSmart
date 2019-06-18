

import static org.junit.Assert.*;

import org.junit.Test;
import actionForm.Client_Login;

public class Client_LoginTest {

	@Test
	public void usernametest() {
   Client_Login Ad = new Client_Login();
		
		Ad.setUserName("admin");
	    		
		assertEquals("admin",Ad.getUserName());
	}
	
	@Test
	public void bankidtest() {
		Client_Login Ad = new Client_Login();
		
		Ad.setBank_id("1234");
	    		
		assertEquals("1234",Ad.getBank_id());
	}
	
	@Test
	public void passwordtest() {
		Client_Login Ad = new Client_Login();
		
		Ad.setPassword("admin123");
	    		
		assertEquals("admin123",Ad.getPassword());
	}
  
	@Test
	public void newpwtest() {
		Client_Login Ad = new Client_Login();
		
		Ad.setNewpw("admin123");
	    		
		assertEquals("admin123",Ad.getNewpw());
	}
	
	@Test
	public void Cnewpwtest() {
		Client_Login Ad = new Client_Login();
		
		Ad.setCnewpw("admin123");
	    		
		assertEquals("admin123",Ad.getCnewpw());
	}
	
	@Test
	public void test() {
		Client_Login Ad = new Client_Login();
		
		Ad.setTest("123");
	    		
		assertEquals("123",Ad.getTest());
	}
	@Test
	public void oldpwtest() {
		Client_Login Ad = new Client_Login();
		
		Ad.setOldpw("123");
	    		
		assertEquals("123",Ad.getOldpw());
	}
}
