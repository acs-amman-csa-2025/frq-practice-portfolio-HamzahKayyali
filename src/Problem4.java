import java.util.*;
import java.io.*;
public class Problem4 {
    public static void main(String[] args) throws Exception {
        File f = new File("data/Problem4.txt");
        Scanner scan = new Scanner(f);

        int soph = 0;
        int jun = 0;
        int sen = 0;
        while(scan.hasNextInt()){
            int line = scan.nextInt();
            scan.nextInt();
            scan.nextInt();
                if(line == 10){
                    soph++;
                }
                if(line == 11){
                    jun ++;
                }
                else{
                    sen++;
                }
    
        
        }
        System.out.println("Class:             Number:");
      System.out.println(".    "  +    12              + "                   " + soph);
      System.out.println(".    "  +    11              + "                   " + jun);
      System.out.println(".    " +     10              + "                   " + sen);
    }
    
}
