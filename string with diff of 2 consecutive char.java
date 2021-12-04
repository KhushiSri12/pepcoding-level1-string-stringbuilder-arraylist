/*
PEPCODING LEVEL-1 STRING,STRING-BUILDER AND ARRAYLIST 


STRING WITH DIFFERENCE OF TWO CONSECUTIVE CHARACTERS
*/
import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		StringBuilder sb=new StringBuilder();
	    sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
		    char curr=str.charAt(i);
		    char prev=str.charAt(i-1);
		    int d=curr-prev;
		    
		    sb.append(d);
		    sb.append(curr);
		    
		}
		return sb.toString();

		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}