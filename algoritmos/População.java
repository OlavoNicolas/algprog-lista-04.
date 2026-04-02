public class População {
public static void main(String[] args) {

double PopulacaoA = 80000.0;
double taxaCrescimentoA = 1.03;
double PopulacaoB = 200000.0;
double taxaCrescimentoB = 1.015; 
int anos = 0;


while(PopulacaoA < PopulacaoB){

PopulacaoA = PopulacaoA * taxaCrescimentoA ;
PopulacaoB = PopulacaoB * taxaCrescimentoB ;
anos++;
}

System.out.println("\nDaqui a: " + anos + " anos cidade A passa B");


    }
}
