package PatientData;

import java.time.LocalDate;

public class MRIData {
    private String mriImageURL;
    private int fieldStrength;
    private LocalDate scanDate = LocalDate.of(2023,11,28);

    public MRIData(String mriImageURL, int fieldStrength, LocalDate scanDate){
        this.mriImageURL = mriImageURL;
        this.fieldStrength = fieldStrength;
        this.scanDate = scanDate;
    }
    public String getMriImageURL(){
        return mriImageURL;
    }
    public int getFieldStrength(){
        return fieldStrength;
    }
    public String getScanDate(){
        return scanDate.toString();
    }
}
