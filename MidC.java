package mypack1;

import java.lang.Character.Subset;
import java.util.Scanner;

public class MidC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		StringBuffer sb= new StringBuffer();
		String ar[]=str.split(" ");
		for(int i=0;i<=ar.length;i++)
		{
			int k=ar[i].length();
			if(k%2==0)
			{
				sb.append(Character.toUpperCase(ar[i].charAt(0)));
				sb.append(ar[i].substring(1)).append(" ");
			}
			else
			{
				int d=k/2;
				sb.append(ar[i].substring(0,d));
				sb.append(Character.toUpperCase(ar[i].charAt(d)));
				sb.append(ar[i].substring(d+1)).append(" ");
				
			}
		}	
			System.out.println(sb.toString());
			
		
		

	}

}
