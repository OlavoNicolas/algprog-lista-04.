import java.util.Scanner;
public class Nota {

public static void main(String[] args) {
    
Scanner leitor = new Scanner (System.in);
int nota; 
int contador = 1 ;
do{

System.out.println("\n Digite uma nota de 0 a 10: ");
nota = leitor.nextInt();

if (nota >= 0 && nota <= 10) {
    
    contador = contador + 1;
    System.out.println("\nSua nota é: " + nota);
    

}else{

System.out.println("\n número inválido digite novamente");

}


}while(contador == 1);



leitor.close();

}    

}
