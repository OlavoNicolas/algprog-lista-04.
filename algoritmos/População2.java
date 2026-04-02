import java.util.Scanner;

public class População2 {
public static void main(String[] args) {

Scanner ls = new Scanner(System.in);
double populacaoA;
double taxaCrescimentoA;
double populacaoB;
double taxaCrescimentoB; 
int anos = 0;



    System.out.println("\nDigite o tamanho da população A: ");
    populacaoA = ls.nextDouble();

    System.out.println("\nDigite a taxa de crescimento A (Ex 3% = 1,03): ");
    taxaCrescimentoA = ls.nextDouble();

    System.out.println("\nDigite o tamanho da população B:");
    populacaoB = ls.nextDouble();

    System.out.println("\nDigite a taxa de crescimento B (Ex 3% = 1,03):");
    taxaCrescimentoB = ls.nextDouble();


while(populacaoA < populacaoB){

populacaoA = populacaoA * taxaCrescimentoA ;
populacaoB = populacaoB * taxaCrescimentoB ;
anos++;

}


System.out.println("\nDaqui a: " + anos + " anos cidade A passa B");

ls.close();

    }
}


