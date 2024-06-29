package src.Introducao;

public class SwitchDiaUtil {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Dom: Final de semana");
                break;
            case 2:
                System.out.println("Seg: Dia útil");
                break;
            case 3:
                System.out.println("Ter: Dia útil");
                break;
            case 4:
                System.out.println("Qua: Dia útil");
                break;
            case 5:
                System.out.println("Qui: Dia útil");
                break;
            case 6:
                System.out.println("Sex: Dia útil");
                break;
            case 7:
                System.out.println("Sab: Final de semana");

        }
    }
}
