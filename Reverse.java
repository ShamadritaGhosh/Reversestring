
import java.util.*;
class practise
{
	public static void main(String args[])
	{
	 String st="",r="";
	 Scanner sc=new Scanner(System.in);
	 System.out.println("\nEnter the sentence to reverse:");
	 st=sc.nextLine();
	 r= Reverse.rev(st);
	 System.out.println("\nThe reversed string is:"+r);
	}
}
class Reverse
{
	static String rev(String st)
	{
		String str="";
		int j;
		int i=st.length()-1;
		while(i>=0)
		{
			while(i>=0 && st.charAt(i)==' ')i--;
			{
				j=i;
			}
			if(i<0)
			{
				break;
			}
			while(i>=0 && st.charAt(i)!=' ')i--;
			{
				if(str.isEmpty())
				{
					str=str.concat(st.substring(i+1,j+1));
				}
				else
				{
					str=str.concat(' '+st.substring(i+1,j+1));
				}
			}
		}
			return str;
	}
}

				

	 
	
