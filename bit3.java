public class bit3 {
    public static void main(String args[]) {
        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBit = ~(bitMask);
        int newNumber =notBit & n;
        System.out.println(newNumber);
    
        }
    
}
