import java.util.Scanner;
class Assignment30{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,sum=0,c=0,d=0;
		
		System.out.println("Enter number of element in an array: ");
		int n = sc.nextInt();
		System.out.println("Enter elements in an array: ");
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++){
			if(a[i]==6){
				c=i;
			}
			if(a[i]==7){
			d=i;
			}
		}
		if(c<d){
			for(i=0;i<c;i++){
				sum = sum+a[i];
			}
			for(i=d+1;i<n;i++){
				sum=sum+a[i];
		}
		}else{
			for(i=0;i<n;i++){
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of elements are: "+sum);
	}
}
				