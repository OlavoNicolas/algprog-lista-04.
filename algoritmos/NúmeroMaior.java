import java.util.Scanner;

public class NúmeroMaior {
    public static void main(String[] args) {
    Scanner ls = new Scanner(System.in);
    int maior, num;
    
    System.out.println("Digite o 1 número: ");
    maior = ls.nextInt();
    
    for(int i = 2; i <= 5; i++){

    System.out.println("Digite o " + i + " número: ");
    num = ls.nextInt();

    if (num > maior) {
        maior = num;
    }
        
    }

    
System.out.println("O maior número digitado foi: " + maior);
ls.close();

}

    }

