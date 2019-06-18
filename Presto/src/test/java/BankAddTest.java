

import static org.junit.Assert.*;

import org.junit.Test;

import BankTesting.BankAdd;

public class BankAddTest {

	@Test
	public void Addtest() {
		
			BankAdd junit = new BankAdd();
			int result = junit.add(100, 200);
			assertEquals(300,result);
		}
	}


