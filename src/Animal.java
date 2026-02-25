public class Animal {
    //Instance variables or attributes
    private String species;
    private String zoo;
    private String name;
    private String sound;

    //Constructor

    public Animal(String Spec, String zo, String nam, String so){
        species = Spec;
        zoo = zo;
        name = nam;
        sound = so;
    }

    //This is all the getters

    public String getSpecies(){
        return species;
    }

    public String getZoo(){
        return zoo;
    }

    public String getName(){
        return name;
    }

    public String getSound(){
        return sound;
    }

    //This is a setter so you could set zoo to something different
    public void setZoo(String newerZoo){
        zoo = newerZoo;
    }

    
}
