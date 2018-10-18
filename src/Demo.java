
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] niz = new int[3];
		niz[0] = 7;
		niz[1] = 6;
		niz[2] = 5;
//		niz[3] = 4; Greska kapacitet niza je ogranizen na 3
		
		for(int i : niz) {
 			System.out.println(" Vrednost element niza " 
 					+ " je " + i );
 		}
	}

}
