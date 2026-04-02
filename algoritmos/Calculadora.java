import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner ls = new Scanner(System.in);
    int numfor, soma = 0;
    
    
    for(int i = 1; i <= 5; i++){

    System.out.println("Digite o " + i + " número: ");
    numfor = ls.nextInt();

    soma += numfor;
     

    }

    double media = soma / 5.0;

    System.out.println("Soma: " + soma + " Média: " + media);


    ls.close();
    
}
}
