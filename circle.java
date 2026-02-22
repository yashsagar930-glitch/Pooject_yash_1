import java.util.Scanner;
class circle{
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radious of circle");
        float r = sc.nextInt();
        float area = 3.14f * r * r ;
        float cir = 2 * 3.14f * r;

        System.out.print("area  "  +area );
        System.out.print("  and  circumference is"+ cir);


    }
}