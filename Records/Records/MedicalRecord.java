package Records;

public class MedicalRecord {
    private String MedicalInfo ="Malaria and Fever";

    public String getMedicalInfo() {
        return MedicalInfo;
    }

    public void updateMedicalInfo(String newMedicalInfo){
        MedicalInfo = newMedicalInfo;
    }

    public static void Showmethod(){
        System.out.println("Static Method");
    }
}
