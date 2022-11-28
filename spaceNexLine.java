public class spaceNexLine {

    public static void nextSpace(String s){
        int start = 0;
        int i =0;
        s.trim();
       while(i<s.length()){
        if(s.charAt(i)!= 'a'){
            i++;
        }
        else{
            
           System.out.println(s.substring(start,i));
            start = i;
            i++;
        }
       }
    }
    public static void main(String[] args) {
        String s = " Hello world for new universe";
        nextSpace(s);
    }
}
