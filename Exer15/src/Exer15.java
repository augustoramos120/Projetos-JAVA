import java.util.Scanner;

//** OBTER TRES VALORES PARA OS LADOS DE UM TRIANGULO E MOSTAR SE
// SE FORMA UM TRIANGULO OU NÃO E SE FOR ISÓCELES, ESCALENO OU EQUILÁTERO



public class Exer15 {
    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite primeiro lado do triângulo: ");
        int lado1 = teclado.nextInt();

        System.out.println("Digite o segundo lado do trinângulo: ");
        int lado2 = teclado.nextInt();

        System.out.println("Digite o terceiro lado do triângulo: ");
        int lado3 = teclado.nextInt();

        if (((lado1  + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

            if(lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero");
            }else if(lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            }else if(lado1 == lado2 || lado3 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóceles");
            }
        }else{
            System.out.println("NÃO FORMA UM TRIÂNGULO");

            }
        }

    }

