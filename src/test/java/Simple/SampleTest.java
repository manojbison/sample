package Simple;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {
 
	@Test
	public void simpltestpass(){
		int a=1;
		int b =2;
		assertTrue( a + b == 3);
		System.out.println("True");
	}
}
