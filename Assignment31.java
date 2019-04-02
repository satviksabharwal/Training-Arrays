class Assignment31{
	public static void main(String[] args){
	
	if(args.length != 4){
	System.out.println("Please enter 4 integer numbers");
	System.exit(0);
	}
	int i,j,x=0,y=args.length;
	int[][] a = new int[2][2];
	int[][] b = new int[2][2];
	
	System.out.println("The given array is: ");
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
		a[i][j] = Integer.parseInt(args[x++]);
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("The reverse of the array is: ");
	for(i=0;i<b.length;i++){
		for(j=0;j<b[i].length;j++){
			b[i][j]=Integer.parseInt(args[--y]);
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}