package codechef.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManager {

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        HospitalBed[] hospbeds = new HospitalBed[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<hospbeds.length;i++)
        {
            int bedno = sc.nextInt();
            sc.nextLine();
            String bedlocation = sc.nextLine();
            boolean isoccupied = Boolean.valueOf(sc.nextLine());
            // sc.nextLine();
            String bedtype = sc.nextLine();
            double bedheight = sc.nextDouble();
            int patientid = sc.nextInt();
            hospbeds[i]= new HospitalBed(bedno,bedlocation,isoccupied,bedtype,bedheight,patientid);
        }
        int bedno1 = sc.nextInt();
        sc.nextLine();
        String bedlocation1 =  sc.nextLine();


        String val = HospitalManager.vacateBed(hospbeds, bedno1);
        System.out.println(val);
        HospitalBed[]  hosps = HospitalManager.findStandardBeds(hospbeds,bedlocation1);
        if(hosps.length>0) {

            for(HospitalBed bed : hosps) {
                if(bed!=null) {
                    System.out.println(bed.getPatientId()+" "+bed.getBedType()+" "+bed.getBedNo()+" "+bed.getBedLocation()+" "+bed.getBedHeight());
                }

            }


        }else{
            System.out.println("Nothing Found");
        }
    }

    public static String vacateBed(HospitalBed[] listBed, int bedNo){
        boolean isFound = false;
        for(HospitalBed bed : listBed){
            if(bed.getBedNo()==bedNo&&bed.getIsOccupied()){
                isFound = true;
                break;
            }
        }
        if(isFound){
            return "Bed vacated successfully";
        }else {
            return "Bed updation unsuccessful";
        }
    }

    public static HospitalBed[] findStandardBeds(HospitalBed[] listBed,String bedLocation){
        List<HospitalBed> standardBeds = new ArrayList<HospitalBed>();
        for(HospitalBed bed : listBed){
            if(bed.getBedType().equalsIgnoreCase("STANDARD")&&bed.getBedLocation().equalsIgnoreCase(bedLocation)){
                standardBeds.add(bed);
            }
        }
        if(standardBeds.size()==0){
            return new HospitalBed[1];
        }else
            return standardBeds.toArray(new HospitalBed[standardBeds.size()]);
    }
}
