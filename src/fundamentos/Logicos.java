package fundamentos;

public class Logicos {
  public static void main(String[] args) {
	boolean condicao1 = true;
	boolean condicao2 = 3 > 7;
	//E
	System.out.println(condicao1 && condicao2);
	
	//OU
	System.out.println(condicao1 || condicao2);
	
	
	//OU EXCLUSIVO
	System.out.println(condicao1 ^ condicao2);
	
	//Negacao
	System.out.println(!condicao1);
	System.out.println(!condicao2);
	
	//Negacao da Negacao
	System.out.println(!!condicao1);
	
	System.out.println("\nTabela verdade E (AND)");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	
	System.out.println("\nTabela verdade OU (OR)");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("\nTabela verdade OU Exclusivo (XOR)");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	System.out.println("\nTabela verdade Negacao (NOT)");
	System.out.println(!true);
	System.out.println(!false);
	



	
}
}
