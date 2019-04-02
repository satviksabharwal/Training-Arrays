import java.util.Scanner;
class Assignment24{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of element in an array");
	int n = sc.nextInt();
	System.out.println("Enter elements in an array");
	int[] a = new int[n];
	int i,min,max;
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	min=a[0];
	max=a[0];
	for(i=0;i<n;i++){
		if(a[i]>max){
			max=a[i];
		}
		if(a[i]<min){
			min=a[i];
		}
	}
	System.out.println("Max number is: "+max);
	System.out.println("Min number is: "+min);
			
	
	}
}