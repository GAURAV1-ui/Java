import java.util.Scanner;

public class WayTooLong71A {
     public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a =  sc.nextInt();
            String[] word = new String[a];
            for(int i=0; i<a; i++){
                word[i]= sc.next();
            }
            for(int i =0; i<a;i++){
                if(word[i].length()<=10){
                    System.out.println(word[i]);
                }
                else{
                    System.out.println(word[i].substring(0,1) + (word[i].length()-2) + word[i].substring(word[i].length()-1));
                }
            }
        }
    }
}
