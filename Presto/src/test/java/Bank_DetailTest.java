

import static org.junit.Assert.*;
import actionForm.Bank_Detail;

import org.junit.Test;

public class Bank_DetailTest {

	@Test
	public void bankbranchnametest() {
    Bank_Detail Ad = new Bank_Detail();
		
		Ad.setBank_branch_name("admin");
	    		
		assertEquals("admin",Ad.getBank_branch_name());
	}
	
	@Test
	public void bankbranchaddtest() {
    Bank_Detail Ad = new Bank_Detail();
		
		Ad.setBank_branch_add("HCL");
	    		
		assertEquals("HCL",Ad.getBank_branch_add());
	}
	
	@Test
	public void bankbranchcitytest() {
    Bank_Detail Ad = new Bank_Detail();
		
		Ad.setBank_branch_city("Chennai");
	    		
		assertEquals("Chennai",Ad.getBank_branch_city());
	}
	
	@Test
	public void bankbranchphonetest() {
    Bank_Detail Ad = new Bank_Detail();
		
		Ad.setBank_branch_phone("9876543210");
	    		
		assertEquals("9876543210",Ad.getBank_branch_phone());
	}
	
	

}
