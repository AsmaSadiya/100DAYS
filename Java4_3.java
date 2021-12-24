import java.util.Scanner;
public class Java4_3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        System.out.println(s);
        if(n<=100 && n>=-100)
        {
            System.out.println("Good job");

        }
         else{
             System.out.println("wrong answer");
         }
    }
    
}
