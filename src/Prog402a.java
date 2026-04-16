import java.util.*;
import java.io.*;
public class Prog402a {
    public static void main(String[] args) throws Exception {
        File f = new File("data/prog402a.txt");
        Scanner in = new Scanner(f);
        String firstLine = in.nextLine();
        System.out.println(firstLine);
        int[] ids = new int[21];
        int[] scores = new int[21];
        for(int i = 0; i < 21; i++){
            ids[i] = in.nextInt();
            scores[i] = in.nextInt();
        }
        double sum = 0.0;
        for(int i = 0; i < 21; i++){
            sum += scores[i];
        }
        double avg = sum / 21;
        System.out.println(avg);

        for(int i = 0; i < 21; i++){
            System.out.println(ids[i] + " " + scores[i] + " " + (scores[i] - avg));
        }
    }
}
