public class reverse {
    public static void reverse1(int index, String str){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
       
        reverse1(index-1,str);
        System.out.println(str.charAt(index));
      
    }
    public static void main(String args[]){
        String str ="apple";
       reverse1(str.length()-1,str);   
    }
}
