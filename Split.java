import java.util.*;
class Split
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str="java is simple language";
String res[]=str.split(" ");
System.out.println(Arrays.toString(res));
String res1[]=str.split("is");
System.out.println(Arrays.toString(res1));
}
}