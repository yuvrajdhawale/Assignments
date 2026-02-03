// W.A.P which accept one number from user and print that number of even numbres on screen.

#include<stdio.h>

void PrintEven(int iNo)
{
    if(iNo <= 0 )
    {
        return;
    }
     int iVar = 1;
     int iNum = 2;
     
     while( iVar <= iNo)
     {
        printf("%d\t",iNum);
        iNum += 2;
        iVar ++;
     }
}



int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    PrintEven(iValue);
    return 0;
}