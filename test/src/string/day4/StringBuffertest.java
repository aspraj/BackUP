package string.day4;

public class StringBuffertest {

	public static void main(String args[])
	{
	StringBuffer sb= new StringBuffer("fgh");
	//string k aage jod dega new string ko	
	sb.append("ijk"); 
	System.out.println("sb=  "+sb);
	
	//	position no 2 p insert karega new string ko
	sb.insert(2, "Hello");
	System.out.println("sb=  "+sb);
	
	//remove content from 8 to 11 and add hi at them
	sb.replace(8, 11, " hi");
	System.out.println("sb=  "+sb);
	
	//it will delete from 0 to 1th position 
	sb.delete(0, 2);
	System.out.println("sb=  "+sb);
	
	//it will reverse the string
	sb.reverse();
	System.out.println("sb=  "+sb);

	//19
	System.out.println(sb.capacity());
	
	StringBuffer sbuff = new StringBuffer(); //16
	
	System.out.println("Default capacity -----"+sbuff.capacity());
	
	sbuff.append("lunch");//capacity still 16
	System.out.println(" capacity -----"+sbuff.capacity());
	
	System.out.println(sbuff);
	
	sbuff.append("Its lunch time"); //(16*2)+2=34
	System.out.println(" capacity -----"+sbuff.capacity());
	
	}
}
