package Package1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import Package2.Student;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		JFrame jFrame = new JFrame("Ne haber");

		Student student = new Student("Cem");

		student.study();

	}

}
