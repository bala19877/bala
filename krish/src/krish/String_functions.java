package krish;

public class String_functions {
	public static void main(String[] args) {
		String s = "     Focus On dreams ";
		 
		int length = s.length();
		System.out.println(length);
		
		boolean equals = s.equals("focus On dreams");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("focus On dreams");
		System.out.println(equalsIgnoreCase);
		 
	    char charAt = s.charAt(7);
		System.out.println(charAt);
		
		String UpperCase = s.toUpperCase();
		System.out.println(UpperCase);
		
		String low = s.toLowerCase();
		
		System.out.println(low);
		
		boolean start = s.startsWith("F");
		System.out.println(start);
		
		boolean end = s.endsWith("s");
		System.out.println(end);
		
		boolean contains = s.contains("drems");
		System.out.println(contains);
		
		int index = s.indexOf('d');
		System.out.println(index);
		
		String trim = s.trim();
		System.out.println(trim);
		int sub = s.substring(on);
		
	}
	
	
	

}
