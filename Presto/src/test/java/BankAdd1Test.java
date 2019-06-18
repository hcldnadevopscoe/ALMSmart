

import static org.junit.Assert.*;

import org.junit.Test;
import BankTesting.BankAdd1;

public class BankAdd1Test {

	@Test
	public void Add1test() {
		BankAdd1 junit = new BankAdd1();
		int result = junit.add(200, 200);
		assertEquals(400,result);
	}

}
