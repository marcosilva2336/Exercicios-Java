package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraIF {
	 public static void main(String[] args) {
		   
		 Scanner input = new Scanner(System.in);
		 double resultado;
		 
		    System.out.println("Digite o primeiro numero:");
		    double num1 = input.nextDouble();

		    System.out.println("Digite o segundo numero:");
		    double num2 = input.nextDouble();

		    System.out.println("Escolha a operacao desejada (+, -, *, /):");
		    String operador = input.next();

		   

		    if (operador.equals("+")) {
		      resultado = num1 + num2;
		    } else if (operador.equals("-")) {
		      resultado = num1 - num2;
		    } else if (operador.equals("*")) {
		      resultado = num1 * num2;
		    } else if (operador.equals("/")) {
		      resultado = num1 / num2;
		    } else {
		      System.out.println("Operacao inválida!");
		      return;
		    }

		    System.out.println("O resultado é: " + resultado);
		  }
		}
