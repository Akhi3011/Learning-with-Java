import java.util.Scanner;

class LinearSearch {
    
    static boolean search(int arr[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the element to search for: ");
        
        int key = scanner.nextInt();
        
        int arr[] = {5, 7, -2, 10, 22, -2, 0, 5, 22, 1};
        
        boolean found = search(arr, arr.length, key);
        
        if (found) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is absent");
        }
        
        scanner.close();
    }
}
