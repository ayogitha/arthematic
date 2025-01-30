import java.util.Scanner;
public class Arthiwthinput {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter a number 1:"); 
      int number1 =scanner.nextInt(); 
      System.out.println("enter a number 2:"); 
      int number2 =scanner.nextInt();
    scanner.close();
System.out.printf("%d+%d=%d",number1,number2,number1+number2);       
    }
    
}
