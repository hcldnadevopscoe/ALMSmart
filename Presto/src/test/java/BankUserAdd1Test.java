

import static org.junit.Assert.*;

import org.junit.Test;
import BankTesting.BankUserAdd1;

public class BankUserAdd1Test {

	@Test
	public void Add1test() {
		
		BankUserAdd1 junit = new BankUserAdd1();
		int result = junit.add(100, 200);
		assertEquals(300,result);
		
	}
   @Test
   public void UserAdd1test(){
	   BankUserAdd1 junit = new BankUserAdd1();
		String result = junit.concat("John","Hack");
		assertEquals("JohnHack",result);
   }

}
