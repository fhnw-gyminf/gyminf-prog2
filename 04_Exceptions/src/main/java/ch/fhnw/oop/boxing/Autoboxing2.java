package ch.fhnw.oop.boxing;

class Autoboxing2 {

	public static void main(String[] args) {
		Integer m1 = 2;
	    Integer n1 = 2;
	    System.out.println( m1 == n1 );   
	    Integer m2 = 127;
	    Integer n2 = 127;
	    System.out.println( m2 == n2 );   
	    Integer m3 = 128;
	    Integer n3 = 128;
	    System.out.println( m3 == n3 );   
	    Integer m4 = 1000;
	    Integer n4 = 1000;
	    System.out.println( m4 == n4 ); 
	    System.out.println( m4+0 == n4 );  
	    
//	    int n = (Integer) null;  
	}

}
