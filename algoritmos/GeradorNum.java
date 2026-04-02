import java.util.Random;
import java.util.Scanner;

public class GeradorNum {
public static void main(String[] args) {
        
Scanner ls = new Scanner(System.in);
Random nm = new Random();
int a,b,c;

System.out.println("\nDigite o 1 número do intervalo do sorteio: ");
a = ls.nextInt();
System.out.println("\nDigite o 2 número do intervalo do sorteio: ");
b = ls.nextInt();

if (a > b) {
    int temp = a;
    a = b;
    b = temp;
}

c = nm.nextInt(b - a + 1) + a ;



System.out.println("O número sorteado foi: " + c);

ls.close();
    }
}
