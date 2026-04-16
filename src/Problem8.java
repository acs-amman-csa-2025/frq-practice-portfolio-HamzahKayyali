import java.util.*;
import java.io.*;
public class Problem8 {
    public static void main(String[] args) throws Exception {
          ArrayList<Person> people = new ArrayList<Person>();
          File f = new File("Data/Problem8.txt");
          Scanner input = new Scanner(f);

          while(input.hasNextLine()){
            String first = input.next();
            String last = input.next();
            int age = input.nextInt();
            String career = input.next();
            Person p = new Person(first, last, age, career);
            people.add(p);

        }
        for(Person p: people){
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
