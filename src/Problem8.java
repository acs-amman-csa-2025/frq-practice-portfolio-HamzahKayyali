import java.util.*;
import java.io.*;
public class Problem8 {
    public static void main(String[] args) throws Exception {
        File f = new File("data/Problem8.txt")
        Scanner in = new Scanner(f);
        ArrayList<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        names.add("g");
        names.add("h");

        for(int i = 0; i < names.size(); i++){
            String name = names.get(i);
            phrase1 = in.next();
            phrase2 = in.next();
            phrase3 = in.next();
            Person name = new Person(phrase1, phrase2, phrase3);
        }
        
       
        
    }
    
}
