package PatientData;

import java.time.LocalDate;

public class Patient {
    private String fullName;
    private int age;
    private String imageURL;
    private String mriImageURL;
    private int mriFieldStrength;
    private LocalDate mriDate;
    private int systolicPressure;
    private int diastolicPressure;
    private LocalDate bpDate;
    private String bpDuration;
    public Patient(String name, int age, String imageURL, String mriImageURL, int mriFieldStrength, LocalDate mriDate, int systolicPressure, int diastolicPressure, LocalDate bpDate, String bpDuration){
        fullName = name;
        this.age = age;
        this.imageURL = imageURL;
        this.mriImageURL = mriImageURL;
        this.mriFieldStrength = mriFieldStrength;
        this.mriDate = mriDate;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.bpDate = bpDate;
        this.bpDuration = bpDuration;
    }
    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }
    public String getImageURL(){
        return imageURL;
    }
    public String getMriImageURL(){
        return mriImageURL;
    }
    public int getFieldStrength(){
        return mriFieldStrength;
    }
    public String getScanDate(){
        return mriDate.toString();
    }
    public int getSystolicPressure(){
        return systolicPressure;
    }
    public int getDiastolicPressure(){
        return diastolicPressure;
    }
    public String getBpDate(){
        return bpDate.toString();
    }
    public String getBpDuration(){
        return bpDuration;
    }
}
