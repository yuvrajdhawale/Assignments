import java.util.*;

class Number 
{
    public boolean Display(int iValue)
    {
        int iCnt =0;

        for(iCnt=2;iCnt<=(iValue/2);iCnt++)
        {
            if((iValue%iCnt)==0)
            {
                return true;
            }
            }
        return false ;

    }
}
class program12//Find prime number
{
    public static void main(String A[])
    {
        int iNo =0;
        boolean bRet = false ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is prime or not");
        iNo = sobj.nextInt();

        Number nobj = new Number();
        bRet= nobj.Display(iNo);
        if(bRet == true)
        {
            System.out.println("The number is not prime nunber ");

        }
        else
        {
            System.out.println("The number is  prime nunber ");


        }




    }
}
