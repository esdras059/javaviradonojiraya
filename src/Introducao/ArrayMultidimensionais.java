package src.Introducao;

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        // Meses por exemplo: Janeiro: 31; Fevereiro: 28; Março: 31...
        int[][] dias = new int[2][2];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[1][0] = 31;
        dias[1][1] = 30;
        for (int i = 0; i < dias.length; i++) {
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-------------------------");
        for (int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
