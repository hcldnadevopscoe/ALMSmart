import static org.junit.Assert.*;

import org.junit.Test;

import BankTesting.BankUserAdd;

public class BankUserAddTest {

	@Test
	public void Addtest() {
		
		BankUserAdd junit = new BankUserAdd();
		int result = junit.add(100, 200);
		assertEquals(300,result);
		
	}
   @Test
   public void UserAddtest(){
	   BankUserAdd junit = new BankUserAdd();
		String result = junit.concat("John","Hack");
		assertEquals("JohnHack",result);
   }
}
