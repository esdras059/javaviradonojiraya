package src.Introducao;

import java.util.Scanner;

public class CategoriaIdade05 {
    public static void main(String []args){
        String categoria;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua idade: ");
        int idade = input.nextInt();
        if(idade < 15){
            System.out.println("Sua categoria é infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Sua categoria é juvenil");
        }else{
            System.out.println("Sua categoria é adulto");
        }
    categoria = idade < 15 ? "Categoria infantil " :idade >= 15 && idade < 18? "Categoria juvenil" : "Categoria adulto";
    }
}
