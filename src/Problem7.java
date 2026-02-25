import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        //Makes a new array list
        ArrayList<Animal> list = new ArrayList<Animal>();
        //makes all the new animals using the constructor
        Animal a = new Animal("Shark","Zoo Market","Jeff","Num Num Num");
        Animal b = new Animal("Chicken","Zoo Market","Broski","Buk Buk Buk");
        Animal c = new Animal("Wolf","Zoo Market","labrobro","AWoooooooo");

        //This adds all the animals in the list
        list.add(a);
        list.add(b);
        list.add(c);

        //This loop prints out each species and name for each animal
        for(Animal loop: list){
            String one = loop.getName();
            String two = loop.getSpecies();
            System.out.println(one + " " + two);
        }

        //This sets the new zoo for animal a
        a.setZoo("International Zoo of Nicaragua");
        System.out.println(a.getZoo());

        

        //This makes the sentence of the thing
        String name = list.get((int)(Math.random() * 4)).getName();
        String zoo = list.get((int)(Math.random() * 4)).getZoo();
        String species = list.get((int)(Math.random() * 4)).getSpecies();
        String sound = list.get((int)(Math.random() * 4)).getSound();
        System.out.println(name + " is a " + species + " that lives in " + zoo + " and says " + sound);

        
    }
    
}
