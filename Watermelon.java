
import java.util.*;
public class Watermelon{

    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            if(n%2 == 0 && n>2){
                System.out.println("Yes");
                
            }
            else{
                System.out.println("No");
            }
        }
    }
} 