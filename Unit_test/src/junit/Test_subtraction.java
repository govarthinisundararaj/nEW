package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Test_subtraction {

	
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void test1() {
	Sub obj = new Sub(9,8);
	System.out.println("Unit_test");
	Assert.assertEquals(1,obj.subtraction());
	}

}
