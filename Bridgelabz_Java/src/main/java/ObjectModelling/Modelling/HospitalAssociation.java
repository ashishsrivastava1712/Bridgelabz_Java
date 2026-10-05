package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate association and communication
 * between Doctor and Patient.
 */

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        patients.add(patient);

        System.out.println(
                "Dr. " + name +
                        " is consulting patient " +
                        patient.name
        );
    }
}

class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void consultDoctor(Doctor doctor) {
        doctors.add(doctor);
        doctor.consult(this);
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

public class HospitalAssociation {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Sharma");
        Doctor doctor2 = new Doctor("Verma");

        Patient patient = new Patient("Ashish");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient);

        patient.consultDoctor(doctor1);
        patient.consultDoctor(doctor2);
    }
}