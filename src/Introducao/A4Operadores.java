package src.Introducao;

public class A4Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println("VAlor " + numero02+numero01);
        int idade = 12;
        double salario = 1240;
        boolean teste = idade >=10 & salario < 2000;
        System.out.println(teste);
        boolean teste2 = idade < 30 && salario >3000;
        System.out.println(teste2);
        double bonus = 2000;
        bonus+= 2000;
        System.out.println(bonus);
    }
}
