package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public int returnItemsReceived() {
		return itemsReceived;
	}
	
	public void setItemsReceived(int num) {
		if (num < 0) this.itemsReceived = 0;
		else this.itemsReceived = num;
	}
	
	public float returnDegreesTurned() {
		return degreesTurned;
	}
	
	public void setDegreesTurned(float num) {
		if (num >= 0.0 && num <= 360.0) this.degreesTurned = num;
		else System.out.println("must be btwn 0.0 and 360.0"); // what's the restraint?
	}
	
	public String returnNomenclature() {
		return nomenclature;
	}
	
	public void setNomenclature(String word) {
		if (word.equals("")) this.nomenclature = " ";
		else this.nomenclature = word;
	}
	
	public Object returnMemberObj() {
		return memberObj;
	}
	
	public void setMemberObj(Object obj) {
		if (obj instanceof String) this.memberObj = new Object();
		else this.memberObj = obj;
	}
	
	@Test
	public void testItemsReceived() {
		int itemsReceived = 5;
		try {
			 setItemsReceived(itemsReceived);
			 assertEquals(itemsReceived, returnItemsReceived());
			 
			 itemsReceived = -1;
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(itemsReceived, returnItemsReceived());
		}
	}
	
	@Test
	public void testDegreesTurned() {
		float degreesTurned = (float) 45.8;
		try {
			setDegreesTurned(degreesTurned);
			assertEquals(degreesTurned, returnDegreesTurned());
			
			degreesTurned = (float) 378.9;
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(degreesTurned, returnDegreesTurned());
		}
	}
	
	@Test
	public void testNomenclature() {
		String str = "vine";
		try {
			setNomenclature(str);
			assertEquals(str, returnNomenclature());
			
			str = "";
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(str, returnNomenclature());
		}
	}
	
	@Test
	public void testMemberObj() {
		Object obj = 85;
		try {
			setMemberObj(obj);
			assertEquals(obj, returnMemberObj());
			
			obj = "hob";
		} catch (Exception e) {
			e.printStackTrace();
			assertEquals(obj, returnMemberObj());
		}
	}
	
	public static void main(String[] args) {
		
	}
}
