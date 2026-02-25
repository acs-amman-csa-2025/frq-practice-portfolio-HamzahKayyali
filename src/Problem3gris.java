import java.util.*;
import java.io.*;

public class Problem3gris {
    public static void main(String[] args) throws Exception{
        File bro = new File("data/Problem3.txt");
        Scanner broski = new Scanner(bro);
        int[] posotive = new int[100];
        int[] negative = new int[100];
        int posi = 0;
        int negi = 0;
        broski.reset();
        while(broski.hasNextInt()) {
            int next = broski.nextInt();
            if (next > 0) {
                posotive[posi] = next;
                posi++;
            }else if (next < 0) {
                negative[negi] = next;
                negi++;
            }
        }
        //Assuming that countNeg and countPos are the same amount
        for(int i = 0; i < Math.max(posi,negi); i++){
            System.out.println(posotive[i] + " " + negative[i]);
        }
       
    }
    
}
