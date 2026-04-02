import java.util.Scanner;

public class Validação {
public static void main(String[] args) {
Scanner ls = new Scanner(System.in);
String nome;
char sexo, estadoCivil;
int idade;
double salario;
char sexoM, estadoCivilM;

do{
    
System.out.println("\nDigite seu nome: ");

nome = ls.nextLine();

if (nome.length() > 3) {

System.out.println("\n Nome válido");



}else{
System.out.println("\n Nome inválido, digite novamente (Deve ter mais do que 3 caracteres)");
    
} 
}while (nome.length() < 3);

do {
    
System.out.println("\nDigite a sua idade: ");
idade = ls.nextInt();

if (idade >= 0 && idade <= 150) {
System.out.println("\n Idade válida");

}else{
System.out.println("\n Idade inválida");
    
} 
    }while (idade < 0 || idade > 150);

do{
    
System.out.println("\nDigite seu sálario R$ ");
salario = ls.nextDouble();

if (salario > 0) {
System.out.println("\n Sálario válido");

}else{
System.out.println("\n Sálario inválido");
    
} 
    }while (salario < 0);

do{
    
System.out.println("\n Seu sexo é: ('f' ou 'm')");
sexo = ls.next().charAt(0);
sexoM = Character.toLowerCase(sexo);
if (sexoM == 'f' || sexoM == 'm') {
System.out.println("\n Sexo válido");

}else{
System.out.println("\n Sexo inválido");
    
} 
    }while ( sexoM != 'f' && sexoM != 'm');

do{
    
System.out.println("\n Seu Estado cívil é: ('s', 'c', 'v', 'd')");
estadoCivil = ls.next().charAt(0);
estadoCivilM = Character.toLowerCase(estadoCivil);
if (estadoCivilM == 's' || estadoCivilM == 'c' || estadoCivilM == 'v' || estadoCivilM == 'd') {
System.out.println("\n Estado cívil válido");

}else{
System.out.println("\n Estado cívil inválido");
    
} 
    }while (estadoCivilM != 's' && estadoCivilM != 'c' && estadoCivilM != 'v' && estadoCivilM != 'd') ;

ls.close();

}
}