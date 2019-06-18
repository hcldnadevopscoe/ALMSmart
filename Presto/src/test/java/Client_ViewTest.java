

import static org.junit.Assert.*;
import actionForm.Client_View;

import org.junit.Test;

public class Client_ViewTest {

	@Test
	public void clidtest() {
       Client_View Ad = new Client_View();
		
		Ad.setClid("admin123");
	    		
		assertEquals("admin123",Ad.getClid());
	}
	
	@Test
	public void detailstest() {
       Client_View Ad = new Client_View();
		
		Ad.setDetails("admin");
	    		
		assertEquals("admin",Ad.getDetails());
	}
	
	@Test
	public void amounttest() {
       Client_View Ad = new Client_View();
		
		Ad.setAmount("2000");
	    		
		assertEquals("2000",Ad.getAmount());
	}
	
	@Test
	public void withdrawntest() {
       Client_View Ad = new Client_View();
		
		Ad.setWithdrawn("2000");
	    		
		assertEquals("2000",Ad.getWithdrawn());
	}
	
	@Test
	public void deposittest() {
       Client_View Ad = new Client_View();
		
		Ad.setDeposit("2000");
	    		
		assertEquals("2000",Ad.getDeposit());
	}
	
	@Test
	public void test() {
       Client_View Ad = new Client_View();
		
		Ad.setTest("test");
	    		
		assertEquals("test",Ad.getTest());
	}
	
	@Test
	public void namounttest() {
       Client_View Ad = new Client_View();
		
		Ad.setNamount("600");
	    		
		assertEquals("600",Ad.getNamount());
	}
	
	@Test
	public void pamounttest() {
       Client_View Ad = new Client_View();
		
		Ad.setPamount("500");
	    		
		assertEquals("500",Ad.getPamount());
	}

}
