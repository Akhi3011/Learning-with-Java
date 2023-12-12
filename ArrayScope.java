import java.util.Scanner;

class HelloWorld {

    
    static void update(int arr[], int n) {
        System.out.println("Inside the function");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Going back to the main function");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = {1, 2, 3};

        update(arr, 3);

        System.out.println("Values in the array after calling the function:");

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
