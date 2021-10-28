public class Armstrong
{
   public static void main(String args[])
{
int num = 153, originalnum, rem, res=0;
originalnum = num;
while(originalnum !=0)
{
rem = originalnum%10;
res+= Math.pow(rem,3);
originalnum/=10;
}
if(res==num)
System.out.println(num + "Armstrong Number");
else
System.out.println(num + "Not Armstrong Number");
}}
