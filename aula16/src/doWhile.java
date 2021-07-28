public class doWhile {
    //PROGRAMA WHILE
    public static void main(String [] srgs){
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);
        while(i <= max) {
            System.out.println("Valor de: " +i);
            i++; // i= =i + 1; ou i += 1;
        }
        System.out.println(i);
        do{
            i++;
            System.out.println("O valor de : "+i);

        }while (i < 15);
        System.out.println(i);
    }
}
