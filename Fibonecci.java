import java.util.Scanner;
/**
 * Modifier :Rahul Itnal
 * Problem: Fibonecci Series using' Iteration Simple Logic
 * Modifing Date:3/10/2018
 * */
public class Fibonocci{
    public static void main(String args[]){
        System.out.print("Enter the number up to");
        int number=new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number +" numbers : ");
    for(int i=1; i<=number; i++)
    {
        System.out.print(fibonacci1(i) +" "); 
        
    }

    }

    public static int fibonacci1(int number){
        if(number==1 || number==2)
        {
            return 1;
        
        }

        int fabA=1,fabB=1,fibonecci=1;
        for(int i=3;i<=number;i++){
            fibonecci=fabA+fabB;
            fabA=fabB;
            fabB=fibonecci;
    
     
        }
      return fibonecci;
    }
    
}