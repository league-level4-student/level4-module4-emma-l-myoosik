package PracticeTest1;

public class test2 {
	
	public static int numFun(int num) {
		if (num / 10 == 0) {
			System.out.println(num);
			return num;
		}
		else {
			System.out.println(num);
			System.out.println((num % 10) );
			return (num % 10) + numFun(num / 10);
		}
	}
	
	public static void mysteryNumber(int n) {
		if (n > 0) {
			mysteryNumber(n-1);
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		System.out.println(test2.numFun(21560));
		test2.mysteryNumber(10);
	}
}
