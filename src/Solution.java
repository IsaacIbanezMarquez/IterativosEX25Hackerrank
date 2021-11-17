
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// MCD_:

/* Fes un programa que llegeixi dos nombres enters positius i escrigui el seu màxim comú divisor. El MCD és el nombre enter positiu més gran que els divideix als dos.

Per més informació sobre MCD: MCD

Input Format

Dos nombres N i M enters positius.

Constraints

No n'hi ha.

Output Format

Nombre enter positiu que sigui el MCD.

Sample Input 0

45 30
Sample Output 0

15
Sample Input 1

9 8
Sample Output 1

1
Sample Input 2

100 25
Sample Output 2

25

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mcd = 1;
        int i;

        if(num1>num2)
        {
            i = num2;
        }

        else
        {
            i = num1;
        }

        boolean x = false;

        for (; i > 0 && !x; i--)
        {
            if(num2 % i == 0 && num1 % i == 0)
            {
                x = true;
                mcd = i;
            }
        }

        System.out.println(mcd);
    }
}
