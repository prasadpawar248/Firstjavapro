package Day2;

public class Stringmethod {

	public static void main(String[] args) {
// String
	
		System.out.println("------String method--------");
		
		String s="welcome";
		String s1=" to java";
		
		System.out.println(s.length());       // length of string  -7
		System.out.println(s.concat("to python"));     // combine to strings by concat  -welcome to java
		
		s="    java   welcome       ";
		
		System.out.println("Before trimming:" +s);            // remove space of sting by trim method	
		System.out.println("After trimming :" +s.trim());    // java   welcome
		
		s="Welcome";
		s1="welcome to java";
		
		System.out.println(s.charAt(4));            // print char value of the given index.  -o
 		System.out.println(s1.contains("welcome"));      //search sequance of char in this string  -true  
		System.out.println(s.equals("welcome"));     // compare two strings  -false
		System.out.println(s.equalsIgnoreCase("welcome"));     // compare two strings but ignore case  -true
		System.out.println(s.replace("e", "o"));      // replace char with some other char.   -Wolcomo
		System.out.println(s1.replace("java", "python"));      // replace word with other word -welcome to python
		System.out.println(s.substring(2,5));  // Return substring of string based on starting index & ending index  -lco
		System.out.println(s.substring(0,3));  //  -Wel
		
		s="MANUAL TEST ENGINEER";
		s1="automation test engineer";
		
		System.out.println(s.toLowerCase()); // print string in lower case letter  -manual test engineer
		System.out.println(s1.toUpperCase());  // print string in upper case letter  -AUTOMATION TEST ENGINEER
		
		
		String str="number 1 out of total 150 pages";
		System.out.println(str.indexOf("o"));           //indexOf("o"); -9
		System.out.println(str.indexOf("n"));
		System.out.println(str.substring((str.indexOf("l")+2),(str.indexOf("p")-1)));
	
		System.out.println(str.startsWith("number"));  // true
		System.out.println(str.endsWith("s"));         // true
	
	}

}
