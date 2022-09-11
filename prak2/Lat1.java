import java.util.Scanner;

class lat1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter num1 & num2:");

    // number input
    int num1 = myObj.nextInt();
    int num2 = myObj.nextInt();

    
    // Output input by user
    System.out.println("num1 + num2 = " + (num1 + num2));
    //System.out.println("num1 – num2  = " + (num1–num2));
    System.out.println("num1 * num2   = " + (num1*num2));
    System.out.println("num1 / num2   = " + (num1/num2));
    System.out.println("num1 % num2   = " + (num1%num2));
    
  }
}
