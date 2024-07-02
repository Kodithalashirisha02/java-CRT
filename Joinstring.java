import java.util.*;
class Joinstring
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str[]={"platform","dependent","language"};
String str1=String.join(" ",str);
System.out.println(str1);
String str2=String.join(" is ",str);
System.out.println(str2);
String str3=String.join("",str);
System.out.println(str3);
}
}