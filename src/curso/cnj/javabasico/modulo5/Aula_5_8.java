package curso.cnj.javabasico.modulo5;

public class Aula_5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1, c = 1;
		
		do {
			System.out.print("  Tabuada do  " + a );
			a++;
		} while(a <= 10);
		System.out.println();
		//a = 1;
		do {
			do {
				String tabuada = (c + " X " + b + " = " +  (c * b));
				String espaco = "";
				int d = (15 -  tabuada.length());
				if ((d%2) ==0) {
					d = d/2;
				} else {
					d = Math. floorDiv(d, 2) +1;
				}
				for(int i = 0; i < d; i++) {
					espaco += " ";
				}
				tabuada = (espaco+tabuada+espaco);
				while(tabuada.length() > 15) {
					tabuada= 
				}
				System.out.print(espaco+tabuada+espaco);
				b++;
			} while(b <= 10);
			System.out.println();
			c++;
			b = 1;

	}while(c <= 10);

}
}
