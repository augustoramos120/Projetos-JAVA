import java.util.Scanner;

public class IfElseCompra {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o preço do item: ");
        double valor = teclado.nextDouble();

        if (valor <= 10){
            System.out.println("Está barato, pode comprar");
        }else if (valor > 10 && valor <= 15){
            System.out.print("Você pode pedir um desconto ");
        }else{
            System.out.print("Não compre, está muito caro");
        }
    }
}
