package PracticeTest1;

public class test1 {
	public static void main(String[] args) {
		String codeAllDay = "Code All Day.";
		int indexOfFirstSpace = codeAllDay.indexOf(" ");
		int indexOfSecondSpace = codeAllDay.indexOf(" ", indexOfFirstSpace + 1); 
		codeAllDay.substring(0, indexOfSecondSpace);
		String codeAllNight = codeAllDay + " night"; 
		System.out.println(codeAllDay + codeAllNight);
		
	}
}
