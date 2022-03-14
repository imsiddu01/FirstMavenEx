package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAfterBefore {
	@AfterEach
	public void dbconn() {
	Assertions.assertEquals("siddu","siddu");
	System.out.println("After Each");
	}

	@Test
	  public void  testAdd()
	  {
		  Calculator c =new Calculator();
		  int r = c.add(300,200);
		  Assertions.assertEquals(500, r);
		  }
	@Test
	 void testAssertFalse() {

	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}

}
