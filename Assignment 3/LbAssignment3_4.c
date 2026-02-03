// Accept one character from user and convrt case of that character.

/* ASCII value of 'a' is 97
 ASCII value of 'A' is 65

 97 - 65 = 32
 1.to convert lower case to upper case -32
 2.to convert upper case to upper case +32
*/


#include <stdio.h>

void DisplayConvert(char cValue)
{
    if((cValue >= 'a') && (cValue <= 'z'))
    {
        printf("%c",cValue - 32);                       
    }
    else if ((cValue >= 'A') && (cValue <= 'Z'))
    {
        printf("%c",cValue + 32);
    }
}
int main()
{
    char cValue = '\0';
    printf("Enter Character : ");
    scanf(" %c ",&cValue);

    DisplayConvert(cValue);
    return 0;
}