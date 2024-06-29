package src.Introducao;

public class Array01 {
    public static void main(String[] args) {
        int[] idade = new int[3];
        idade[1] = (int) 21.3F;

        String[] nomes = new String[3];
        nomes[0] = "Lucas";
        nomes[1] = "Ferreira";
        nomes[2] = "Mateus";
        for(int i = 0; i<=nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
