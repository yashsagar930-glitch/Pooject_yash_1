import java.util.Scanner;
class dev{
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter the secound number");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("sum is :"+c);
    }
}