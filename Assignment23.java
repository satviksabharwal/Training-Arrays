import java.util.Scanner;

class Assignment23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,sum=0,avg;
		System.out.println("Enter Elementsin array");
		for(i=0;i<n;i++){
		a[i]= sc.nextInt();
		}
		
		for(i=0;i<n;i++){
		sum=sum+a[i];
		}
		System.out.println("Sum of array is: "+sum);
		avg=sum/n;
		System.out.println("Average of array elements are: "+avg);
	}
}