package src.javacore.introducaoclasses.test;

import src.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);

        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);

    }
}
