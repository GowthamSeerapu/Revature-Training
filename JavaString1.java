package mypack1;

public class JavaString1 {

	public static void main(String[] args) 
	{
		String s ="Hi change the last letter of my words to upper case";
		
		System.out.println(fun1(s));
		

	}
	public static String fun1(String s)
	{
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			int k= ar[w].length();
			sb.append(ar[w].substring(0,k-1)).append(Character.toUpperCase(ar[w].charAt(k-1))).append(" ");;
		}
			
		return sb.toString().trim();
	}

}
