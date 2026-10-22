
public class Main {

	public static void main(String[] args) {

		int[][] arr1 = { { 10, 20, 30 }, { 40, 50, 60 } };

		System.out.println("0'a 0'daki eleleman: " + arr1[0][0]);
		System.out.println("1'a 2'daki eleleman: " + arr1[1][2]);

		System.out.println("-----------------------");

		int[][] arr2 = new int[2][3];
		arr2[0][0] = 90;
		arr2[0][1] = 80;
		arr2[0][2] = 70;
		arr2[1][0] = 60;
		arr2[1][1] = 50;
		arr2[1][2] = 40;

		System.out.println("0'a 1'deki eleleman: " + arr2[0][1]);
		System.out.println("1'a 2'daki eleleman: " + arr2[1][2]);

		System.out.println(" ");

		System.out.print("arr2'nun elemanları: ");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr2[i][j] + ", ");
			}
		}

	}

}
