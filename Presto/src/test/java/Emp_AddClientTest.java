

import static org.junit.Assert.*;
import actionForm.Emp_AddClient;

import org.junit.Test;

public class Emp_AddClientTest {

	@Test
	public void bankidtest() {
Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setBank_id("1423");
	    		
		assertEquals("1423",Ad.getBank_id());
	}
	
	@Test
	public void branchtest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setBranch("HCL");
	    		
		assertEquals("HCL",Ad.getBranch());
	}
	
	@Test
	public void firstnametest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setFirstName("John");
	    		
		assertEquals("John",Ad.getFirstName());
	}
	
	@Test
	public void middlenametest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setMiddleName("A");
	    		
		assertEquals("A",Ad.getMiddleName());
	}
	
	@Test
	public void lastnametest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setLastName("A");
	    		
		assertEquals("A",Ad.getLastName());
	}
	
	@Test
	public void gendertest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setGender("Male");
	    		
		assertEquals("Male",Ad.getGender());
	}
	@Test
	public void dobtest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setGender("Male");
	    		
		assertEquals("Male",Ad.getGender());
	}
	
	@Test
	public void landlinetest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setLandLine("987654321");
	    		
		assertEquals("987654321",Ad.getLandLine());
	}
	
	@Test
	public void mobiletest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setMobile("987654321");
	    		
		assertEquals("987654321",Ad.getMobile());
	}
	
	@Test
	public void emailtest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setEmail("admin@gmail.com");
	    		
		assertEquals("admin@gmail.com",Ad.getEmail());
	}
	
	@Test
	public void addresstest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setAddress("Chennai");
	    		
		assertEquals("Chennai",Ad.getAddress());
	}
	
	@Test
	public void citytest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setCity("Chennai");
	    		
		assertEquals("Chennai",Ad.getCity());
	}
	
	@Test
	public void statetest() {
		Emp_AddClient Ad = new Emp_AddClient();
		
		Ad.setState("Chennai");
	    		
		assertEquals("Chennai",Ad.getState());
	}

}
