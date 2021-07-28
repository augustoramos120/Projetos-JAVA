import java.util.Scanner;
// -----------PARA VER SE O NÙMERO È PAR OU IMPAR  -----------
public class Exerc18 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = teclado.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }

    }
}
