/*
PEPCODING LEVEL-1 STRING,STRING-BUILDER AND ARRAYLIST 


STRING COMPREHENSION
*/
public class Main {

	public static String compression1(String str){
		// write your code here
		  String s=str.charAt(0)+"";
		  for(int i=1;i<str.length();i++){
		      char curr=str.charAt(i);
		      char prev=str.charAt(i-1);
		      if(curr!=prev){
		          s+=curr;
		      }
		      
		  }

		return s;
	}

	public static String compression2(String str){
		// write your code here
		  String s=str.charAt(0)+"";
		  int c=1;
		  for(int i=1;i<str.length();i++){
		      char curr=str.charAt(i);
		      char prev=str.charAt(i-1);
		      if(curr==prev){
		          c++;
    	      }
    	      else{
    	          if(c>1){
    	          s+=c;
    	          c=1;
    	      }
    	      s+=curr;
    	      }
		      
		  }
		  if(c>1){
		      s+=c;
		      c=1;
		  }
		  
		 

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}