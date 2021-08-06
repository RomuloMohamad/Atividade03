import java.util.Scanner;
public class DeclaracaoJoao {
   public static void main(String[] args) {
	 System.out.println("Seja bem vindo Sr.João");
	 Scanner input= new Scanner(System.in);
	 
	 double salario;
	 System.out.println("Digite seu salario:"); 
	 salario= input.nextDouble();
	 	
	 
	
	 	 
	 
	 if ((salario >=1900.00)&&(salario <=2800.00)) {
		 System.out.println("Valor a declarar é R$:"+ ( (salario -142 )  *0.075));
		 
	 }
	 else if ((salario >=2800.01)&&(salario <=3751.00 )) {
     System.out.println("valor a declarar é R$:"+ ( (salario -350)  *0.15));
     
	 }
	 
	 else if ((salario >=3751.01)&&(salario <=4664.00)){
     System.out.println("valor a declarar é R$:"+ ((salario -636) *0.225));
	 }
	
	 else if ((salario >=0)&&(salario <1900)) {
     System.out.println("Valor Insento de Imposto de Renda");
     
	 }
	 else if(salario >4664.00){
	 System.out.println("valor invalido, por favor especificar Valores entre R$:1900,00 à R$4664,00.");
	 }
	 
	 
    
		 
		 
	 
	 
   }  
	   
   }
