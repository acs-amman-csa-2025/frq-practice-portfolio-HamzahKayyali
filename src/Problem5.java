import java.util.*;
import java.io.*;

public class Problem5 {
    public static void main(String[] args) throws Exception{
        File f = new File("data/Problem5.txt");
        Scanner scan = new Scanner(f);

        double gSop = 0;
        double gJun = 0;
        double gSen = 0;
        double sop = 0;
        double jun = 0;
        double sen = 0;

        while(scan.hasNext()){
            int num = scan.nextInt();
            if(num == 10){
                sop++;
                gSop += scan.nextInt();
            }
            if(num == 11){
                jun++;
                gJun += scan.nextInt();
            }
            if(num == 12){
                sen++;
                gSen += scan.nextInt();
            }
        }
        double gpaSop = gSop/sop;
        double gpaJun = gJun/jun;
        double gpaSen = gSen/sen;
        System.out.println("Class:             Class GPA:");
      System.out.println(".    "  +    12              + "                   " + gpaSop);
      System.out.println(".    "  +    11              + "                   " + gpaJun);
      System.out.println(".    " +     10              + "                   " + gpaSen);
    }
}
