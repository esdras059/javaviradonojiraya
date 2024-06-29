package src.Introducao;

public class ImpostoSalario {
    public static void main(String[] args) {
        double salarioAnual = 20000;
        double impostoUm = 9.70 / 100;
        double impostoDois = 37.35 / 100;
        double impostoTres = 49.5 / 100;

        if (salarioAnual < 34712) {
            salarioAnual *= impostoUm;
        } else if (salarioAnual > 34712 && salarioAnual < 68507) {
            salarioAnual *= impostoDois;
        } else {
            salarioAnual *= impostoTres;
        }
        System.out.println("O imposto em cima do seu salário é: " + salarioAnual + ".");
    }
}
