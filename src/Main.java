import Hospital.Patient;
import Records.MedicalRecord;
import Staff.Doctor;
import Staff.Receptionist;
import Finance.FinanceRecord;
import Finance.Administrator;

public class Main{
    public static void main(String[] args){

        Patient p= new Patient();
        MedicalRecord m= new MedicalRecord();
        Doctor d= new Doctor();
        Receptionist r= new Receptionist();
        FinanceRecord f= new FinanceRecord();
        Administrator a= new Administrator();

        r.viewPatient(p);
        d.viewMedical(m);
        d.updateMedical(m);
        System.out.println("Update Medical Information = " + m.getMedicalInfo());

        a.showBill(f);

    }
}