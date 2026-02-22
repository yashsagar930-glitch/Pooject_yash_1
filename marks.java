import  java.util.Scanner;
 class marks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter english marks");
        int a = sc.nextInt();

        System.out.println("Enter hindi marks");
        int b = sc.nextInt();

        System.out.println("Enter math marks");
        int c = sc.nextInt();

        int total = a + b + c;
        int avg = a + b + c / 3 ;

        System.out.println("total marks " + total);
        System.out.println(" average " + avg);

    }
}