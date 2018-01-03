package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Test_combine {


	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void unit_test(){
		Sub s2 = new Sub("PK","-PAT");
		System.out.println("Det");
		Assert.assertEquals("PK-PAT",s2.combine());
	}
}
