import java.util.*;

class Addition
{
    public int Addition(int iValue1,int iValue2)
    {
        int iSum =0;
        iSum = iValue1+iValue2;
        return iSum;

    }
}
class program1//Addition of two numbers
{
    public static void main(String A[])
{

    int iNo1 =0;
    int iNo2 =0;
    int iRet =0;


    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the first number :");
    iNo1 = sobj.nextInt();

    System.out.println("Enter the second number :");
    iNo2 = sobj.nextInt();

   Addition aobj = new Addition();

   iRet = aobj.Addition(iNo1,iNo2);

   System.out.println("Addition of numbers is "+iRet);


}}