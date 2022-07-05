public class minPartitions {
    public static int minPartition(String n) {
        
        int temp = n.charAt(0)-'0';
      for(int i = 1;i<n.length();i++){

        int temp1 =  n.charAt(i)-'0';

        if(temp1>temp){

            temp = temp1;
        }
      }
      return temp;
    
           }
           
  

public static void main(String args[]) {
    String n = "34";
   
    System.out.println( minPartition(n));
}

}