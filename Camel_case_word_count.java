import java.util.*;
class solution
{
static int countWords(String str)
{
    int count = 1;
    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i)>=65&&str.charAt(i)<=90)
            count++;
    }
    return count;
}
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
        String str = in.next();
 
    System.out.print( countWords(str));
 
}
}