import java.util.*;
import java.io.*;

public class Problem9 {
    public static void main(String[] args) throws Exception{

        ArrayList<Cat> kitties = new ArrayList<Cat>();
        File f = new File("data/Problem9.txt");
        Scanner in = new Scanner(f);
        while(in.hasNextLine()){
            String line = in.nextLine();
            int commaPos = line.indexOf(",");
            String name = line.substring(0, commaPos);
            String line2 = line.substring(commaPos + 1);
            int commaPos2 = line2.indexOf(",");
            String weightStr = line2.substring(0, commaPos2);
            String line3 = line2.substring(commaPos2 + 1);
            int commaPos3 = line3.indexOf(",");
            String ageStr = line3.substring(0, commaPos3);
            String costStr = line3.substring(commaPos3 + 1);
            double weight = Double.parseDouble(weightStr);
            int age = Integer.parseInt(ageStr);
            double cost = Double.parseDouble(costStr);
            Cat meow = new Cat(name, weight, age, cost);
            kitties.add(meow);
        //All names of the kitties
        }
        for(Cat purr: kitties){
            System.out.println(purr.getName());
        }
        //Name of the third kittie
        System.out.println("The third cats name is " + kitties.get(2).getName());
        //New uptaded versions
        String[] names = {"Jeff", "Broski", "Sniper", "Jerome", "James", "King Lewis"};

        for(int i = 0; i < kitties.size(); i++){
        int randomIndex = (int)(Math.random() * names.length);
        String randomName = names[randomIndex];
        kitties.get(i).setName(randomName);
        int randomAge = (int)(Math.random() * 20);
        kitties.get(i).setAge(randomAge);
        double randomWeight = (double)(Math.random() * 100);
        kitties.get(i).setWeight(randomWeight);
        double randomCost = (double)(Math.random() * 3000);
        }
        //Cat got Fat
        Cat lastCat = kitties.get(kitties.size() - 1);
        lastCat.setWeight(lastCat.getWeight() + 5);
        System.out.println(lastCat.getWeight());

        //I changed the names, there is no Rascal so I will choose Jerome
        for(int i = 0; i < kitties.size(); i++){
            if(kitties.get(i).getName().equals("Jerome")){
                kitties.remove(i);
            }
        }
        //New Cat Angel
        Cat meowMeow = new Cat("Angel", 3.6, 12, 25.990);
        kitties.add(1, meowMeow);
        
        //New Cat
        Cat skiiiiiiiiiiriiii = new Cat("Gimpy", 8.3, 120,  24.990);
        kitties.add(1, skiiiiiiiiiiriiii);
        //New kitties
        for(Cat purr: kitties){
            System.out.println(purr.getName() + " " + purr.getWeight() + " " + purr.getAge()
         + " " + purr.getCost());
        }
        //Switching the cats
        Cat broBro = new Cat("Sugar", 11.6, 84, 33.25);
        lastCat = kitties.get(4);
        kitties.add(4, broBro);
        kitties.add(kitties.size() - 1, lastCat);
        Cat cat4 = kitties.get(1);
        Cat cat2 = kitties.get(3);
        kitties.set(1, cat2);
        kitties.set(3, cat4);
        
    }
    for(Cat purr: kitties){
            System.out.println(purr.getName());
        }

    for(int i = 0; kitties.size(); i++){
        if(kitties.get(i).getCost() < 40){
            kitties.remove(i);
        }
    }
    for(Cat purr: kitties){
        System.out.println(purr.getCost());
    }
    for(int i = 0; kitties.size(); i++){
        if(kitties.get(i).getWeight > 8){
            System.out.println(kitties.get(i))
        }
    }
    
}

