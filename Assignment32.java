class Assignment32{
	public static void main(String[] args){

	if(args.length!=9){
		System.out.print("Please enter 9 integer numbers");
		System.exit(0);
	}
	
	int[][] a = new int[3][3];
	int i,j,x=0;
	
	System.out.println("The given array is: ");
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
				a[i][j] = Integer.parseInt(args[x++]);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	int max=0;
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			if(a[i][j]>max){
					max=a[i][j];
			}
		}
	}
	
	
	System.out.println("The biggest number in the given array is: " + max);
	
	}
}