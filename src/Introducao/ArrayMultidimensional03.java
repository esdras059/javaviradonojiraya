package src.Introducao;

public class ArrayMultidimensional03 {
    public static void main(String[] args) {
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for(int[] array2 : arrayInt2){
            System.out.println(" ");
            for(int num : array2){
                System.out.println(num);
            }
        }
    }
}
