// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
		    Solution obj=new Solution ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPrime(int N) {
     
     if (N==1){ //1 is neither prime not composite
         
         return false;
         
     }
     
     if (N==2 || N==3){ //2 and 3 are prime 
         
         return true;
         
     } 
     
     if(N%2==0 || N%3==0){ //anything divisible by 2 and 3 cannot be prime
         
         return false;
         
     }
     
     for(int i=5;i*i<=N;i=i + 6){ //since 4 is non prime we started the loop from 5. 
         
         if(N%i==0 || N%(i+2) ==0){ //for the very first iteration we will check whether 5 and 7 divide the numbers or not
                                    //if they do, than the no. is non prime and the program will return false. This loop will continue till N.
             
             return false; 
       
         }
      
     }
    return true;
     
     
    }
}
