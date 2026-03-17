import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x =0;
    int y =0;

    System.out.println("Enter number at metres of width : ");
    x = sc.nextInt();
    System.out.println("Enter number at metres of height : ");
    y = sc.nextInt();

    double metres = x * y;

    System.out.println("Your area is ar metres : " + metres);



    sc.close();
    }
}
