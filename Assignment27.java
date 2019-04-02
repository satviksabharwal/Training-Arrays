import java.util.Scanner;
class Assignment27{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of an element in an array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,j,temp;
		
		System.out.println("Enter elements in an array: ");
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
			
		}
		
		System.out.println("Largest two number are: ");
		System.out.println(a[n-1]+", "+a[n-2]);
		System.out.println("Smallest two number are: ");
		System.out.println(a[0]+", "+a[1]);
	}
}