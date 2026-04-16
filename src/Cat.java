public class Cat {
    //Instance Variables
    private String name;
    private double weight;
    private int age;
    private double cost;
    //Default Constructor
    public Cat(){
        name = "Unknown";
        weight = 0;
        age = 0;
        cost = 0;
    }
    //Overloaded Constructor
    public Cat(String na, double we, int ag, double co){
        name = na;
        weight = we;
        age = ag;
        cost = co;
    }
    //Getters
     public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public double getCost() {
        return cost;
    }
    //Setters
    public void setName(String newName){
        name = newName;
    }

    public void setWeight(double newFat){
        weight = newFat;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setCost(double newCost){
        cost = newCost;
    }
}







