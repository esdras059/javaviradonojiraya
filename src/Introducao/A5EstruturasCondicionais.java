package src.Introducao;

public class A5EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("autorizado beber");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado");
        }
    }
}

