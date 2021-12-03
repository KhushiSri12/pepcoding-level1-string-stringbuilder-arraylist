/*
PEPCODING LEVEL-1 STRING,STRING-BUILDER AND ARRAYLIST 


PRINT ALL PALINDROMIC SUBSTRING
*/
import java.io.*;
import java.util.*;

public class Main {
    
    public static  boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
                
                
            }
        }
        return true;
    }

	public static void solution(String s){
		//write your code here
		for(int i=0;i<s.length();i++){
		    for(int j=i+1;j<=s.length();j++){
		        String ss=s.substring(i,j);
		        if(isPalindrome(ss)==true){
		            System.out.println(ss);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		solution(s);
	}

}