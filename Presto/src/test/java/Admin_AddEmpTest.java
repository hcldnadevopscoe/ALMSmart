

import static org.junit.Assert.*;

import org.junit.Test;
import actionForm.Admin_AddEmp;


public class Admin_AddEmpTest {

	@Test
	public void branchtest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setBranch("Hyderabad");
	    		
		assertEquals("Hyderabad",Ad.getBranch());
	}
	
	@Test
	public void gendertest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setGender("Male");
	    		
		assertEquals("Male",Ad.getGender());
	}
	
	@Test
	public void emailtest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setEmail("admin.gmail.com");
	    		
		assertEquals("admin.gmail.com",Ad.getEmail());
	}
	
	@Test
	public void mobiletest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setMobile("9876543210");
	    		
		assertEquals("9876543210",Ad.getMobile());
	}
    
	@Test
	public void firstnametest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setFirstName("John");
	    		
		assertEquals("John",Ad.getFirstName());
	}
	
	@Test
	public void middlenametest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setMiddleName("A");
	    		
		assertEquals("A",Ad.getMiddleName());
	}
	
	@Test
	public void lastnametest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setLastName("hack");
	    		
		assertEquals("hack",Ad.getLastName());
	}
	
	@Test
	public void addresstest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setAddress("HCL");
	    		
		assertEquals("HCL",Ad.getAddress());
	}
	
	@Test
	public void citytest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setCity("Chennai");
	    		
		assertEquals("Chennai",Ad.getCity());
	}
	
	@Test
	public void statetest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setState("TamilNadu");
	    		
		assertEquals("TamilNadu",Ad.getState());
	}
	
	@Test
	public void bankidtest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setBank_id("1234");
	    		
		assertEquals("1234",Ad.getBank_id());
	}
	
	@Test
	public void landlinetest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setLandLine("9876543210");
	    		
		assertEquals("9876543210",Ad.getLandLine());
	}
	
	@Test
	public void rolenametest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setRole_name("Manager");
	    		
		assertEquals("Manager",Ad.getRole_name());
	}
	
	@Test
	public void dobtest() {
		Admin_AddEmp Ad = new Admin_AddEmp();
		
		Ad.setDob("18-06-2000");
	    		
		assertEquals("18-06-2000",Ad.getDob());
	}
	
	
	
}
