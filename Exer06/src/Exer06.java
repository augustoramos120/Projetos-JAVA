import java.util.Scanner;
// VER QUAL NUMERO È MAIOR
public class Exer06 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = teclado.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O num1 é maior: "+num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("O num2 é maior: "+num2);
        }else if (num3 >= num1 && num3 >= num2){
            System.out.println("O num3 é maior: " + num3);
        }
    }
}

