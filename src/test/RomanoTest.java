package test;

import static org.junit.Assert.*;
import main.Romano;

import org.junit.Test;

public class RomanoTest {
private Romano romano;
private String ans;
	@Test
	public void getOne() {
		romano = new Romano();
		int i=1;
		ans= romano.convertIntegerToRoman(i);
		assertEquals(ans, "I");
	}
	@Test
	public void getRomanNumberOnetoNine() {
		romano = new Romano();
		String oneToTen[]={"No existe el 0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
		for(int i=1; i<=9 ; i++){
			ans= romano.convertIntegerToRoman(i);
			assertEquals(ans, oneToTen[i]);
		}			
	}
	@Test
	public void getNumber399() {
		romano = new Romano();
		ans= romano.convertIntegerToRoman(399);
	    assertEquals("CCCXCIX", ans);
	}
	@Test
	public void getNumber28() {
		romano = new Romano();
		ans= romano.convertIntegerToRoman(28);
	    assertEquals("XXVIII", ans);
	}
	@Test
	public void getRomanBasicSymbols () {
		String basicSymbols[]  = {"M","CM","D", "C","XC", "L", "X", "IX", "V", "I"};
		int numbers[] = 		{1000, 900,500, 100, 90, 50, 10, 9,5, 1};
		romano = new Romano();
		for(int i=0; i<basicSymbols.length ; i++){
			ans= romano.convertIntegerToRoman(numbers[i]);		
			assertEquals(ans, basicSymbols[i]);
		}			
	}
	
}
