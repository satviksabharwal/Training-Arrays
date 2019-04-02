import java.util.Scanner;
class Assignment26{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter number of element in an array");
		int n = sc.nextInt();
		System.out.println("Enter elements in an array");
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Corresponding Character value of ASCII value are: ");
		for(i=0;i<n;i++){
			char str = (char)a[i];
			System.out.print(a[i]+" = "+str+", ");
		}
	}
}