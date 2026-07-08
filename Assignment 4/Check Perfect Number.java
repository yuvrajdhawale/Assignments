import java.util.*;

class Number 
{
    public boolean CheckPerfect(int iValue)
    {
        int iCnt =0;
        int iSum =0;
        
         for(iCnt =1;(iCnt<=iValue/2);iCnt++)
        {
            if((iValue % iCnt)==0)
            {
               
                iSum = iCnt+iSum;
            }
        }
        if(iValue==iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class program15
{
    public static void main(String []A)
    {
        int iNo=0;
        boolean bRet = false;


        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number which u want to check");
        iNo= sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckPerfect(iNo);
        if(bRet==true)
        {
            System.out.println("The number is perfect ");
        }
        else{
            System.out.println("The number is not perfect.");
        }

        

    } 
}