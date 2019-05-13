import java.io.*;
import java.util.*;
class Summ
{ 
      
    
    static int sum(int a, int d,int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum = sum + a; 
            a = a + d; 
        } 
        return sum; 
    } 
      
    public static void main(String args[]) 
    { 
	Scanner input=new Scanner(System.in);
        int a =input.nextInt(); 
        int d=input.nextInt();
	int n=input.nextInt(); 
        System.out.println(sum(a, d, n)); 
    } 
} 
