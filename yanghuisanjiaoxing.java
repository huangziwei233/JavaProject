package text;

public class yanghuisanjiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=6,indent,i,j;
         int a[][]=new int[n][n];
         a[1][1]=1;
         for(i=2;i<n;i++)
         {
        	 a[i][1]=1; 
        	 a[i][i]=1;
        	 for(j=1;j<i;j++)
        		 a[i][j]=a[i-1][j-1]+a[i-1][j];
         }
         indent=25;
         for(i=1;i<n;i++){
         for(int k=1;k<=indent;k++)		 
        	 System.out.print(" ");
         for(j=1;j<=i;j++)
        	 System.out.print(a[i][j]+" ");
         System.out.println();
         indent=indent-2;
         }
	}

}
