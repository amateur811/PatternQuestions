/******************************************************************************
    *********
     *******
      *****
       ***
        *



*******************************************************************************/
//Pattern star rule
// 9 = 10-1 = (2*5-1) = (2*(n-i+1)-1)
// 7 = 8-1(2*4-1)
// 5= (2*(n-i +1)))
// 3
// 1
public class Main
{
    public static void pattern9(int n){
       
        for(int i=1;i<=n;i++){
	        for(int j=1;j<i;j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<((2*(n-i+1)-1));k++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
    }
	public static void main(String[] args) {
	    int n=5;
	    pattern9(n);
	   
	}
}
