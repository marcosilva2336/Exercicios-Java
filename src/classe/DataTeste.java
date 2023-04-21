package classe;

public class DataTeste {
    public static void main(String[] args) {
		//usando sem paramentros
    	Data d1 = new Data();
		
		//usando construtor com paramentros
		var d2 = new Data(31, 12, 2023);
		
		//usando apenas String
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		//usando o void
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
    }
}