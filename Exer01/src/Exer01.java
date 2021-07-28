import java.util.Scanner;

//      VER QUAL NUMERO E MAIOR

public class Exer01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num1 = teclado.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = teclado.nextInt();
         if(num1 > num2){
             System.out.println("O num1 é maior "+num1);
         }else {
             System.out.println("O num2 é maior " + num2);
         }
    }
}
