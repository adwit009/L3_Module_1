package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }

	 String multiply(int i, int j) {
		String answer = i + " x "+j+ " = "+ i*j;
		 return answer;
	}

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	boolean isPrime(int i) {
		int flag =0;
		int y = (int) Math.sqrt(i);
		
		for (; y > 1; y--) { 
			if (i%y == 0){ 
			flag = 1;
				break;
			}
			}
		if (flag == 1) { 
			return false;
		}		
		else{
		return true; 
	}
	}

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	 boolean isSquare(int i) {
		
		 double y =  Math.sqrt(i);	
		 if (y%1 ==  0) {
			return true;
		}
		 else {
			return false; 
		}
		 
	 
	 }

	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

	private boolean isCube(int i) {
		// TODO Auto-generated method stub
		return false;
	}



}
