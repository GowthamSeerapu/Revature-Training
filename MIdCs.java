package mypack1;

class MIdCs {

	public static void main(String[] args) {
		String str= "geu dbifa sisi ";
		StringBuffer sb= new StringBuffer();
		String ar[]=str.split(" ");
		for(int i=0;i<ar.length;i++)
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
