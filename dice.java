public class dice {

    public static void dice1(String p, int target) {
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i =1;i<=6 && i<=target ;i++){
            dice1(p+i , target -i);
        }
    }
    public static void main(String[] args) {
        dice1("" , 4);
    }
}
