/******************************************************************************
        *
       ***
      *****
     *******
    *********


*******************************************************************************/

public class Main
{
    public static void pattern8(int n){
       
        for(int i=1;i<=n;i++){
	        for(int j=i;j<n;j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<((2*i)-1);k++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
    }
	public static void main(String[] args) {
	    int n=5;
	    pattern8(n);
	   
	}
}
