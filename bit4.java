import java.util.Scanner;

public class bit4 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int oper = sc.nextInt();
            int n=5;
            int pos = 1;
            int bitMask = 1<<pos;
            if(oper == 1){
            
            int newNumber =bitMask | n;
            System.out.println(newNumber);
   
            }else{
                int notBit = ~(bitMask);
                int newNumber =notBit & n;
                System.out.println(newNumber);
            }
        }
    
    
}
}
