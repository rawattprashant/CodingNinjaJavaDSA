package recursion1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= null;
		fun(1);
		
		
//		int num = 3;
//	    print(num);
	}

	public static int fun(int  s){
	    System.out.println(s);
	    if(s < 3)
	    	fun(fun(fun(++s)));
	    return s;
	}
	
}
