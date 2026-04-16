public class Problem11 {
    public static int[][] arrayMaker(int a, int b){
        int row = a;
        int column = b;
        int[][] array = new int[row][column];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; i < j; i++){
                int random = (int)(Math.random() * 101);
                array[i][j] = random;
            }
        }
        
        return array;
    }

public static void printArray(int[][] array){
    for(int i = 0; i < array.length; i++){
        for(int j = 0; i < j; i++){
            System.out.print(array[i][j] + ",");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int[][] a1 = arrayMaker(5, 7);
    int [][] a2 = arrayMaker(6,7);
    printArray(a1);
    System.out.println();
    printArray(a2);
}
}