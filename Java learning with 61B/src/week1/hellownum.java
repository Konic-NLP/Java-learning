package week1;

public class hellownum {
	
	 public static void windowPosSum(int[] a, int n) {

		 for(int j=0; j< a.length;j++) {
			 if (a[j]<0) {
				 continue;
			 }int sum=0;
		    for(int k=0;k<=n;k++) {
//		    	System.out.println(k);
//		    	长度是6，但是下标最大只能是5， 下标和长度的关系：下标最大值为长度-1
		    	if(k+j>a.length-1) {
		    		break;
		    	}

		    	sum=sum+a[k+j];
		    	
		    }	
		
		    a[j]=sum;
		    }
		
		  }

	public static void main(String[] args) {

		int[] a = {1, 2, -3, 4, 5, 4};
	    int n = 3;
	    windowPosSum(a, n);
	    System.out.println(java.util.Arrays.toString(a));
	    int x = 0;
	    int sum=0;
        while (x < 10) {
           sum=sum+x;
           x++;
           System.out.print(sum+ " ");
        		  
        }
      
	}
	
		
		
		
		
	}





/*1.all variable has to be declared before using and the variable have to be a specific type 
 * 
 * 2. java variable cannot be changed
 * 3. in Java , type verified before the code runs ! if there are type isssues, the code will noy compiled
 * 
 *4.why we need .class 
 *	1) check the type 
 *	2).class file are 'simpler' for the machine to execute, distributed code is faster. \
 *	3) protect your intelectual property, because the user cannot see the source code
 * class method public static ; instance method, not 'static '
 * 
 * 
 * 
 * */
