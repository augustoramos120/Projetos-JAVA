import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma letra F ou M: ");
        String input = teclado.next();

        if(input.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        }else if (input.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        }else{
            System.out.print("Sexo inválido");
        }
    }
}
