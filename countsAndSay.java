public class countsAndSay {
    public static String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        
        String str2 = "11";
        if(n==2){
            return str2;
        }        
        
        int i = 2;
        int count = 1;
        int ans =0;
        while(n>i){
        
        for(int j =1 ; j<str2.length();j++){
        if(str2.charAt(j-1) == str2.charAt(j) && j<str2.length() ){
            count++;
            }
        else{
            int temp = 0;
           temp = count*10 + (str2.charAt(j-1) - '0');
            ans = ans *100 + temp;
            count = 1;
        }  
        }
            str2=String.valueOf(ans);
            i++;
    }
        
        return str2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println( countAndSay(n));
    }
}
