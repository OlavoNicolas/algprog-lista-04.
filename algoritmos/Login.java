import java.util.Scanner;
public class Login {

public static void main(String[] args) {
    
Scanner leitor = new Scanner (System.in);
String user, senha; 
int contador = 1 ;
do{

System.out.println("\n Digite o nome de usuário: ");
user = leitor.nextLine();

System.out.println("\n Digite uma senha: ");
senha = leitor.nextLine();


if (!user.equals(senha)) {
    
contador = contador + 1;
System.out.println("\nLogin realizado com sucesso!!: " + user);
    

}else{

System.out.println("\n Usuário e senha não podem ser os mesmos");

}


}while(contador == 1);



leitor.close();

}    

}

