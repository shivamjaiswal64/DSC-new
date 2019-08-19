class StrConcat1{
	public static void main(String[] args) {
	String s="good";// When You are doing String Concatenation using '+' then both 
	s=s+" morning";// operator must be string.
	System.out.println(s);
	String s1="food";
	String s2=s1+10;// In JVM new Integer(10).toString() will be done
	System.out.println(s1);
	System.out.println(s2);//food10
	}
}