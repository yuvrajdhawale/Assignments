//Accept one number from user and print that number of * on screen

#include<stdio.h>

void Display(int iCnt)
{
    int iNo = 0;

    iNo = iCnt; 
    while(iNo >= 1)
    {
        printf("*\n");
        iNo --;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}