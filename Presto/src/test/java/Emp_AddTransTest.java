

import static org.junit.Assert.*;
import actionForm.Emp_AddTrans;

import org.junit.Test;

public class Emp_AddTransTest {

	@Test
	public void clidtest() {
Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setClid("admin123");
	    		
		assertEquals("admin123",Ad.getClid());
	}
	
	@Test
	public void detailstest() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setDetails("admin123");
	    		
		assertEquals("admin123",Ad.getDetails());
	}
	
	@Test
	public void amounttest() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setAmount("2000");
	    		
		assertEquals("2000",Ad.getAmount());
	}
	
	@Test
	public void withdrawntest() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setWithdrawn("2000");
	    		
		assertEquals("2000",Ad.getWithdrawn());
	}
	
	@Test
	public void deposittest() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setDeposit("2000");
	    		
		assertEquals("2000",Ad.getDeposit());
	}
	
	@Test
	public void test() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setTest("test");
	    		
		assertEquals("test",Ad.getTest());
	}
	
	@Test
	public void namounttest() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setNamount("100");
	    		
		assertEquals("100",Ad.getNamount());
	}
	
	@Test
	public void pamounttest() {
      Emp_AddTrans Ad = new Emp_AddTrans();
		
		Ad.setPamount("100");
	    		
		assertEquals("100",Ad.getPamount());
	}

}
