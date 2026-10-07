import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {

            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num == 50) {
                System.out.println("50 entered. Stopping...");
                break;
            }
        }
    }
}