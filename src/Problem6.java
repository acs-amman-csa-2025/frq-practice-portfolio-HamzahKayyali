import java.util.*;
import java.io.*;

public class Problem6 {
    public static void main(String[] args) throws Exception{
        //Step 1
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 19; i++){
            list.add((int)(Math.random() * 71 + 20));
        }
        //Step 2
        for(int i = 0; i < list.size() - 1; i++){
            System.out.println(list.get(i));
        }
        //Step 3
        for(int num: list){
            System.out.println(num);
        }
        //Step 4
        int mid = list.size()/2;
        System.out.println(list.get(mid));

        //Step 5
        int first = list.get(0);
        int last = list.get(19);
        int avg = (first + last + mid) / 3;
        System.out.println(avg);

        //Step 6
        int small = 100;
        int large = 0;
        for(int i = 0; i < 19; i++){
            int element = list.get(i);
            if(element < 100){
                small = element;
            }
            if(element > large){
                large = element;
            }
            System.out.println(small);
            System.out.println(large);
        }
        //Step 7
        for(int i = 0; i < 19; i++){
            int element2 = list.get(i)
            if(large == element2){
                list.set(i, small);
            }
        }

        //Step 8
        int random = (int) (Math.random() * 10) + 1;
        list.set((list.size()-1)/2, random);


        //Step 9
        for(int i = 0; i < 19; i++){
            list.set(i, list.get(i) + 10);
        }

        //Step 10
        int ousted = list.get(2);
        int lNew = list.set(2, 5);
        System.out.println(ousted);

        //Step 11
        for(int i = 0; i < 19; i++){
            int great = list.get(i);
            if(great > 50){
                System.out.println(great);
            }
        }

        //Step 12
        for(int i = 0; i < 19; i++){
            int num = list.get(i);
            if(num % 4 == 0){
                System.out.println(num);
            }
        }

    }
    
}
