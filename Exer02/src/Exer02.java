import java.util.Scanner;


//    VER SE O NÙMERO È POSSITIVO

public class Exer02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = teclado.nextInt();

        if(num1 >= 0){
            System.out.println("O número digitado é posisitvo");
        }else
            System.out.println("O número digitado é negativo");
    }
}
