package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	
	void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	ArrayList<Patient> getPatients(){
		return patients;
	}
	
	void assignPatientsToDoctors() throws DoctorFullException {
		int doctor = 0;
		for (int i = 0; i < patients.size(); i++) {
			doctors.get(doctor).assignPatient(patients.get(i));
			
			if (doctor == doctors.size() - 1) doctor = 0;
			doctor++;
		}
	}
	
}
