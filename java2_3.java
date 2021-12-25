import java.util.Scanner;
public class End_of_file{

     public static void main(String []args){
    Scanner scanner=new Scanner(System.in);
    String str=scanner.nextLine();
    int n=scanner.nextInt();
    for (int i=0;i<=n;i++){
    scanner.hasNext();
    System.out.println(i +" " +scanner.nextLine());
    }
     }
}