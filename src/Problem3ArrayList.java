import java.util.*;
import java.io.*;

public class Problem3ArrayList {
    public static void main(String[] args) throws Exception{
        File f = new File("data/Problem3.txt");
        Scanner in = new Scanner(f);
        //This makes two new Array Lists for negative and positive
        ArrayList<Integer> positives = new ArrayList<Integer>();
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        //The while loop is the same however the .add 
        //method adds next to all the elements in the array
        while(in.hasNextInt()){
            int next = in.nextInt();
            if(next > 0){
                positives.add(next);
            }
            else{
                negatives.add(next);
            }
        //This is the same thing as normal arrays however you use
        // .get in order to get the value of the element
        // this is because its for Array Lists
        }
         for(int i = 0; i < positives.size(); i++){
                System.out.println(positives.get(i) + " " + negatives.get(i));
            }
    }
    
}
