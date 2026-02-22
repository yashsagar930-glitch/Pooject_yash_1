import java.util.Scanner;
class rectangle {
    public static void main(String args[]){   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the bredth of rectangle");
        int b = sc.nextInt();


        int peri = 2 * (l + b) ;
        int area = l * b ;
        System.out.println("perimeter is "+ peri);
        System.out.println("area is "+ area);



    }
}  