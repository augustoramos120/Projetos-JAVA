import java.util.Scanner;

/**Supondo que uma população de um pais A seja de ordem de 80000 habitantes
 * com uma taxa  anual de crescimento de 3% e que a população de B
 * seja 200000 habitantes com uma taxa de cresimento de 1.5 %.
 * faça um programa qua calcule e escreva o número de anos para a
 * população A ultrapassar ou igualar a população B
 */
public class Exerc05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while(popA < popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont ++;
        }
        System.out.println("População A: " +popA);
        System.out.println("População B: " +popB);
        System.out.println("Qtd. ano: " + cont);
    }
}