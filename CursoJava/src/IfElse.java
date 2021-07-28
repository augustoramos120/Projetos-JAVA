import java.util.Scanner;

public class IfElse {
    public static void main(String [] args){


        Scanner teclado = new  Scanner(System.in);
        System.out.print("Qual sua idade");
        int  idade = teclado.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade");
        }else
            System.out.println(" menor");
    }
}
