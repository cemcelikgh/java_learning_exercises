
public class Main {

	public static void main(String[] args) {

		String s1 = "Mustafa";
		String s2 = new String("Mustafa");
		String s3 = "Mustafa";
		String s4 = new String("Mustafa");

		System.out.println("s2'nun uzunluğu: " + s2.length());
		System.out.println("s2'nun 0. index'indeki eleman: " + s2.charAt(0));
		System.out.println("s2'nun 5. index'indeki eleman: " + s2.charAt(5));
		System.out.println("s2'nun sun index'indeki eleman: " + s2.charAt(s2.length() - 1));
		System.out.println("s2 \"Mu\" ile başlıyor mu: " + s2.startsWith("Mu"));
		System.out.println("s2 \"af\" ile bitiyor mu: " + s2.endsWith("af"));

		System.out.println("---------------------------------");

		System.out.println("s1 ve s3 eşit mi: " + (s1 == s3));
		System.out.println("s1 ve s2 eşit mi: " + (s1 == s2));
		System.out.println("s2 ve s4 eşit mi: " + (s2 == s4));

		System.out.println(" ");

		System.out.println("s1 ve s3'nin değerleri eşit mi: " + s1.equals(s3));
		System.out.println("s1 ve s2'nun değerleri eşit mi: " + s1.equals(s2));
		System.out.println("s2 ve s4'nun değerleri eşit mi: " + s2.equals(s4));
		System.out.println("s2 ve s4'nun değerleri eşit mi: " + s4.equals(s2));

	}

}
