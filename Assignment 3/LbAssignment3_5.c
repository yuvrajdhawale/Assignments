// Accept one Character from user and ckeck whether that character is vowel (a,e,i,o,u) or not

#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

char ChkVowel(char cValue)
{
    if(cValue == 'a'|| cValue =='e'||cValue =='i'||cValue =='o'||cValue =='u')
    {
        return TRUE;
    }
    else 
    {
        return FALSE;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter character : ");
    scanf("%c",&cValue);

    bRet = ChkVowel(cValue);

    if (bRet == TRUE)
    {
        printf("Character is Vowel\n");
    }
    else
    {
        printf("Character is not Vowel");
    }
    

}