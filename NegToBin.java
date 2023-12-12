public class NegToBin {
    public static void main(String[] args) {
        
        int n = -10;

        String binaryRepresentation = Integer.toBinaryString(n);

        System.out.println("Binary representation of " + n + " is: " + binaryRepresentation);
    }
}