import java.util.Scanner;
public class FunctionIntro {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter b number: ");
        int b = scanner.nextInt();
        
        int ans = 1;
        
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        
        System.out.println("Answer is: " + ans);
        scanner.close();
        
    }
}
