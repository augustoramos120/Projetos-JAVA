import java.util.Scanner;

//  INFORMAR DOIS VALORES E ESCOLHER A OPERAÇÃO ENTRE ELES: + , - , X , OU /

public class Exerc19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.println("Entre com o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Entre com a operação ( + ou * ou - ou / : ");
        String operacao = teclado.next();

        double resultado = 0;
        boolean valida = true;

        switch(operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default:
                System.out.println("Operação Inválida !");
                valida = false;
        }
        if (valida) {
            System.out.println("Resultado é " +resultado);
            if(resultado >=0){
                System.out.println("Resultado Positivo");
            }else{
                System.out.println("Resultado Negativo");
            }
            if(resultado % 2 == 0){
                System.out.println("Resultado Par");
            }else{
                System.out.println("Resultado Impar");
            }
        }
    }
}
