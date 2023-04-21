package fundamentos;

public class tenario {
public static void main(String[] args) {

	double media = 5.6;
	String resultadoRecuperacao = media > 5.0 ? "Em recuperacao" : "reprovado";
	String resultadoFinal = media >= 7.0 ? "Aprovado" : "Recuperacao" + resultadoRecuperacao;
	
	System.out.println("O aluno esta " + resultadoFinal);
}
}
