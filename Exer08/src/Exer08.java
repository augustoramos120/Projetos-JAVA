import java.util.Scanner;
public class Exer08 {
    public static void main(String [] argas){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        double preco1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        double preco2 = teclado.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double preco3 = teclado.nextDouble();

        System.out.println("");
        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre o produto 1! Ela custa "+preco1 );
        }else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Compre o produto 2! Ele custa "+preco2);
        }else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Compre o produto 3! Ele custa "+preco3);
        }

    }
}
