package com.junit.addition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {
	 Calculator c;
     @Test
     void addtest() { 
  	   c=new Calculator();
  	   int ans = c.add(6, 3);
  	   assertEquals(9, ans);
     }

}
