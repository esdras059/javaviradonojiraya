package src.Introducao;

public class ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[4][];
        int[] array = {2,4,6};
        arrayInt[0] = new int[]{1, 2, 3, 4, 5, 6};
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];
        arrayInt[3] = array;


        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
