package com.bridgelabz.review1;

//Bhabagrahi Sahoo
public class PalindromNumber {
    public static void main(String[] args) {
        int n =535;
        int x =n;
        int rev=0,rem;

        while(x !=0)
        {
            rem= x %10;
            rev=rev*10+rem;
            x = x /10;
        }

        if(n==rev)
        {
            System.out.println(n+" is Palndrom");
        }
        else
        {
            System.out.println(n+"not palindrom");
        }
    }
}
