import java.util.*;
class Number
{
	
	public static void main(String []args) 
	{
		int l,find;
        Scanner	sj = new Scanner(System.in);
        l=sj.nextInt();
        find=sj.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sj.nextInt();
        }
        System.out.print(arr[find-1]);
       
	}
}
