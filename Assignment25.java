import java.util.Scanner;
class Assignment25{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i,c=0,cnt=-1;
	System.out.println("Enter number of element in an array:");
	int n = sc.nextInt();
	System.out.println("Enter elements in an array: ");
	int[] a = new int[n];
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("Enter number to be checked in an array: ");
	int b = sc.nextInt();
	
	for(i=0;i<n;i++){
		if(a[i]==b){
			cnt=i;
			break;
		}
		
	}
	System.out.println("Output will be: ");
	
	System.out.println(cnt);
	}
}
	