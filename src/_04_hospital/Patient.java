package _04_hospital;

public class Patient {
	boolean pulse = false;
	boolean feelsCaredFor = false;
	
	void checkPulse() {
		if (!pulse) {
			pulse = true;
		} else {
			pulse = false;
		}
	}
	
	boolean feelsCaredFor() {
		if (pulse) {
			feelsCaredFor = true;
		} else {
			feelsCaredFor = false;
		}
		return feelsCaredFor;
	}

}
