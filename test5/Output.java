package test5;

//class Student{
//    String name;
//    int rollNo;
//    Student(int n){
//    rollNo = n;
//    }   
//    void print(){
//    System.out.print(rollNo +" " + name+" ");
//    }
//}

//class A{
//	   A(){
//	        System.out.print("first ");
//	    }
//	}
//	class B extends A{
//	    B(){
//	        System.out.print("second ");
//	    }
//	}
//	class C extends B{
//	    C(){
//	        System.out.print("third ");
//	    }
//	}

class Car{
    String color;
    double price;
}

public class Output {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "black";
		System.out.println(c.color);
	    }
}
