import java.util.*;
import java.io.*;

public class Problem3 {
    public static void main(String[] args) throws Exception{
        File bro = new File("data/Problem3.txt");
        Scanner broski = new Scanner(bro);
        String firstLine = broski.nextLine();
        System.out.println(firstLine);
        int countPos = 0;
        int countNeg = 0;
        while(broski.hasNextInt()){
            int num = broski.nextInt();

            if(num > 0){
                countPos++;
            }
            else if(num < 0){
                countNeg++;
            }
        }
        Scanner pos = new Scanner(bro);
        int[] posotive = new int[countPos];
        int[] negative = new int[countNeg];
        for(int i = 0; i < countPos; i++){
            int numberPos = pos.nextInt();
            if(numberPos > 0){
                posotive[i] = numberPos;
            }
            else if(numberPos < 0){
                i = i-1;
            }
        }
        Scanner neg = new Scanner(bro);
        for(int i = 0; i < countNeg; i++){
            int numberNeg = neg.nextInt();
            if(numberNeg < 0){
                negative[i] = neg.nextInt();
            }
            else if(numberNeg > 0){
                i = i-1;
            }
        }
        //Assuming that countNeg and countPos are the same amount
        for(int i = 0; i < countPos; i++){
            System.out.println(posotive[i] + " " + negative[i]);
        }
    }
    
}
