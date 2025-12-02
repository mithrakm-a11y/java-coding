//Sum of first N natural numbers:
import java.util.Scanner;
public class naturalno
{
public static void main(String[] args)
{
Scanner val=new Scanner(System.in);
int N = val.nextInt();
int sum=0;
for(int i=1;i<=N;i++)
{
   sum +=i;
}
System.out.println(sum);
}
}

