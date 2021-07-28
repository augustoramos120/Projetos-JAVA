import java.util.Scanner;

//  IDENTIFICAR UM CRIME COM 5 PERGUNTAS SE A PESSOA É SUSPEITA, CÚPLICE, INOCENTE OU CULPADA

public class Exerc20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String resp1 = teclado.next();

        System.out.println("Esteve no local do crime?");
        String resp2 = teclado.next();

        System.out.println("Mora perto da vítima?");
        String resp3 = teclado.next();

        System.out.println("Ja trabalhou com a vítima?");
        String resp4 = teclado.next();

        System.out.println("Devia para a vítima");
        String resp5 = teclado.next();

        int cont = 0;
        if (resp1.equalsIgnoreCase("S")){
            cont ++;
        }
        if(resp2.equalsIgnoreCase("S")){
            cont ++;
        } if (resp3.equalsIgnoreCase("S")){
            cont ++;
        }if (resp4.equalsIgnoreCase("S")){
            cont ++;
        }if (resp5.equalsIgnoreCase("S")){
            cont ++;
        } if(cont <= 2){
            System.out.println("Suspeito");
        }else if(cont ==3 || cont == 4){
            System.out.println("Cúmplice");
        }else if(cont == 5){
            System.out.println("Assassino");
        }else if(cont < 1){
            System.out.println("Inocente");
        }

    }
}


