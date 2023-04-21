package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
       public static void main(String[] args) {
		   double a = 1.1213126554545; //Implicita
    	   System.out.println(a);
    	   
    	   float b = (float) 1.1213126554545; //explicita (cast)
    	   System.out.println(b);
    	   
    	   int c = 340; //explicita (Cast)
    	   byte d = (byte) c;
    	   System.out.println(d);
    	   
    	   double e = 1.9999999;
    	   int f = (int) e; //explicita (cast);
    	   System.out.println(f);
	}
}
