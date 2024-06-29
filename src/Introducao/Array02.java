package src.Introducao;

public class Array02 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 =new int[]{1,2,3,4,5};
        int[] numeros3 = {8,1,4,7,1};
        int indice = 0;
        //for (int i = 0; i < numeros2.length; i++) {
          //  indice += 1;
       // }
        for (int num : numeros3) {
            System.out.println(num);

        }
       // System.out.println("No array há "+indice+" índices.");
    }
}
