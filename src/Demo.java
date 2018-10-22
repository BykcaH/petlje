import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		char[][] nizKaraktera = new char[3][3];
		System.out.println(nizKaraktera.length);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesit 5 karaktera");
		for(int i = 0; i < nizKaraktera.length ; i++) {
			for(int j = 0; j < 3; j++) {
				nizKaraktera[i][j] = input.nextLine().charAt(0);
			}
		}
		
		System.out.println("Unesite karakter za proveru");
		char provera = input.nextLine().charAt(0);
		
		boolean nalaziSeUNizu = false;
		for(int i = 0; i < nizKaraktera.length; i++) {
			for(int j = 0; j < 3; j++) {
			if(nizKaraktera[i][j] == provera) {
				System.out.println("Char " + provera +
						" se nalazi na " +  (i+1) + "," + (j+1) + " poziciji");
				nalaziSeUNizu = true;
			} 
		}
		}
		if(nalaziSeUNizu == false) {
			System.out.println("Element se ne nalazi u nizu.");
		}
	}

}
