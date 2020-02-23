//sorting of an 1-Dimensional array
import java.util.*;
class sorting{
    public static void main(String args[]){
        int len,i,j,temp;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        len=Integer.parseInt(args[0]);
        int a[]=new int[len];
        int c[]=new int[len];
        System.out.println("enter elements for array");
        for(i=0;i<len;i++)
            {
                a[i]=Integer.parseInt(args[i+1]);
            }
        for(i=0;i<len-1;i++)
            {   
                for(j=0;j<len-i-1;j++)
                    {
                        if(a[j]>a[j+1])
                        {
                            temp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                        }
                    }
           }
        System.out.println("Sorted ordered");
        for(i=0;i<len;i++)
           {
               System.out.println(a[i]);
           }
    }
}