
public class Demo {

	public static void main(String[] args) {
		int [][] matrica = {{1, 2, 3}, {2, 3, 1}, {3, 2, 1}};
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println(" ");
			for(int j = 0; j<3; j++) {
				System.out.print(matrica[i][j] );
			}
		}
	}

}
