package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> docPatients = new ArrayList<Patient>();
	boolean doMedicine = false;
	
	boolean performsSurgery() {
		return false;
	}
	
	boolean makesHouseCalls() {
		return false;
	}
	
	void assignPatient(Patient patient) throws DoctorFullException {
		if (docPatients.size() > 3) throw new DoctorFullException();
		docPatients.add(patient);
	}
	
	ArrayList<Patient> getPatients(){
		return docPatients;
	}
	
	void doMedicine() {
		for (Patient p: docPatients) {
			p.pulse = true;
		}
	}
	
}
