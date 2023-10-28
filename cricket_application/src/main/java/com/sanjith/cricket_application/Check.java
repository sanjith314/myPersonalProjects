//$Id$
package com.sanjith.cricket_application;

import java.util.Scanner;

class Check{
    
    public static void main(String args[]){
		Scanner in= new Scanner(System.in);
        System.out.println("Enter digit: ");
        int n=in.nextInt();
        for(int i=11;i<=n;i++){
            if(plaindromeCheck(i))
                System.out.println(i);
        }
    }
    public static boolean plaindromeCheck(int n){
        int r,sum=0,temp;    
        temp=n;    
        while(n>0){    
            r=n%10;
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        return temp==sum;
    }
}
