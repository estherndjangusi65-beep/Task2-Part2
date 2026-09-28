package Staff;

import Hospital.Patient;
public class Receptionist {

    public void viewPatient(Patient p){
        System.out.println("Patient Name = " + p.getName());
        System.out.println("Patient Appointment = " + p.getAppointment());
    }
}
