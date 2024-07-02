import java.util.*;
class Stringbuffer
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
StringBuffer str1=new StringBuffer("Java");
StringBuffer str2=new StringBuffer(" language");
System.out.println(str1);
System.out.println(str2);
str1.append(str2);
System.out.println(str1);
}
}