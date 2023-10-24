import java.util.Scanner;

public class Zadatak1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int broj1;
		broj1 = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Unesite drugi broj: ");
		int broj2;
		broj2 = input.nextInt();
		System.out.println("Unijeli ste prvi broj: " + broj1);
		System.out.println("Unijeli ste drugi broj: " + broj2);
}
} 