package fundamentals;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8};
		arr=change(arr);
		System.out.println(arr[7]);

		
	}
	
	public static int [] change(int input[]){
		input = new int[5];
		input[3] = 15;
		return input;
		}
	  

}










//String str1 = new String ("I love coding"); 
//String str2 = "I love coding"; 
//boolean check=(str1=="I love coding");
//System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check); 
//  	int arr[] = new int[5]; 
//    int arr2[] = new int['a']; 
//    int bt = 10; 
//    int arr3[] = new int[bt]; 
//    System.out.print(arr.length); 
//    System.out.print(" "+arr2.length+" "); 
//    System.out.print(arr3.length); 
    
//int arr[] = new int[15];
//arr=change(arr);
//System.out.println(arr[7]);


// decimal to binary
/* int n =s.nextInt();
		if(n==0) {
			System.out.println(n);
		}
		else {
			long binary[] = new long[40];    
	     int index = 0;    
	     while(n > 0){    
	       binary[index++] =  (n%2);    
	       n = n/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }
		}*/



/*System.out.print("*\n");
for(i=1;i<=n ;i++) {
	
	System.out.print("*");
	
	for(j = 1;j<=i;j++) {
		System.out.print(j);
	}
	for(k = i-1;k>=1;k--) {
		System.out.print(k);
	}
	System.out.print("*");
	System.out.println();
	
}///////////queen rosey9867193925

for(i=n-1;i>=1 ;i--) {
	
	System.out.print("*");
	
	for(j = 1;j<=i;j++) {
		System.out.print(j);
	}
	for(k = i-1;k>=1;k--) {
		System.out.print(k);
	}
	System.out.print("*");
	
	System.out.println();
	
}
System.out.print("*");*/

//Scanner s = new Scanner(System.in);
//int n = s.nextInt();
//int arr[]=new int [n];
//for(int i = 0;i<n;i++) {
//	arr[i] = s.nextInt();
//}
//Scanner s = new Scanner(System.in);
//int t = s.nextInt(),i,count=0;
//int n1 = s.nextInt(),n2 = s.nextInt(),n3;  
//for(i=0;i<t-2;i++){
//  n3 = s.nextInt();
//  if((n1>n2)&&(n2<n3))
//    count++;
//  else if((n1<n2)&&(n2>n3))
//    count++;
//  n1 = n2;
//  n2 = n3;
//  
//}
//if(count>1)
//  System.out.print("false");
//else
//  System.out.print("true");
//
// int n=10,r=6;
//    int factn=1,factr=1,factnr=1;
//    for(int i=2;i<=n;i++)
//    {
//        factn*=i;
//        if(i<=r)
//            factr*=i;
//        if(i<=n-r)
//            factnr*=i;
//    }
//    int ncr=factn/(factr*factnr);
//    System.out.print(ncr);