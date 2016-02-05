package feedlotFiles;

public class ClassArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myA[][] = new int [5][4];
		int num = 0;
		for (int c = 0; c <4; c++){
			for (int r = 0; r < 5; r++){
				myA [r][c] = (2*num)+1;
				num = num+1;
			}
		}
		//now print it anytime wiht this code
		for (int r = 0; r < myA.length; r++){
			for (int c = 0; c < 4; c++){
				System.out.printf("%3d", myA[r][c]);
			}
			System.out.println();
		}

	}

}
