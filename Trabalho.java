import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double horasTrabalhadas;
		double salario; 
		
		System.out.println("Informe horas trabalhadas: ");
		horasTrabalhadas = input.nextInt();
		
		System.out.println("Informe seu salário bruto: ");
		salario = input.nextInt();
		
		double valorDia = (salario / 30);
		double valorHora = (valorDia / 8);

		double valorReceber = (horasTrabalhadas * valorHora);
		
		System.out.println("Você receberá: R$ " + valorReceber);
		
		input.close();
		
	}	
}	