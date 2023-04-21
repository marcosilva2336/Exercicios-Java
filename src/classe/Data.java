package classe;

public class Data {
  int dia;
  int mes;
  int ano;
  
  Data(){
	  dia = 1;
	  mes = 1;
	  ano = 1970;
	  
  }
  
  Data(int diaInicial, int mesInicial, int anoInicial){
	  dia = diaInicial;
	  mes = mesInicial;
	  ano = anoInicial;
	  
	  
  }
  //melhor funcionalidade essa funcao
  String obterDataFormatada() {
	  return String.format("%d/%d/%d", dia, mes, ano);
  }
  
  //essa apenas ia funcionar no terminal do sistema
  void imprimirDataFormatada() {
	  System.out.println(obterDataFormatada());
  }
}
