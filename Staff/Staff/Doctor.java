package Staff;
import Records.MedicalRecord;

public class Doctor {

    public void viewMedical (MedicalRecord m){
        System.out.println("Medical Information = " +m.getMedicalInfo());
    }

    public void updateMedical(MedicalRecord m){
        m.updateMedicalInfo("Fever");

    }

}

