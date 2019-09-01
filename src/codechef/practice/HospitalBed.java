package codechef.practice;

public class HospitalBed {

    private int bedNo;
    private String bedLocation;
    private boolean isOccupied;
    private String bedType;
    private double bedHeight;
    private int patientId;

    public HospitalBed(int bedNo, String bedLocation, boolean isOccupied, String bedType, double bedHeight, int patientId){
        this.bedNo = bedNo;
        this.bedLocation = bedLocation;
        this.isOccupied = isOccupied;
        this.bedType = bedType;
        this.bedHeight = bedHeight;
        this.patientId = patientId;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public int getBedNo() {
        return bedNo;
    }

    public String getBedLocation() {
        return bedLocation;
    }

    public void setBedLocation(String bedLocation) {
        this.bedLocation = bedLocation;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setIsOccupied(boolean isOccupied) {
        isOccupied = isOccupied;
    }

    public double getBedHeight() {
        return bedHeight;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setBedHeight(double bedHeight) {
        this.bedHeight = bedHeight;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
