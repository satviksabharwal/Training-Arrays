import java.util.Scanner;
import java.util.Arrays;
class Assignment29{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of an element in an array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,j=0;
		int[] b = new int[n];
		System.out.println("Enter elements in an array: ");
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		for(i=0;i<n-1;i++){
			if(a[i]!=a[i+1]){
			b[j++]=a[i];
			}
			//System.out.print(a[i]);
		}
		b[j]=a[n-1];
		
		System.out.println("Distinct array is: ");
		for(i=0;i<=j;i++){
			System.out.print(b[i]+" ");
		}
	}
}