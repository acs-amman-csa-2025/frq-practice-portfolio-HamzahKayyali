public class GenAvg {
    public static void main(String[] args) {
        double sum = 0;
        int random;
        for(int i = 0; i < 50; i++){
            random = (int)(Math.random() * 100) + 1;
            sum = sum + random;
        }
        double average = sum/50;
        System.out.print(average);
    }
}
