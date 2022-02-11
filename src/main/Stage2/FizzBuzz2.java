package main.Stage2;
public class FizzBuzz2 {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        System.out.println("debut des tests");
       fizzBuzz(100);
    }
    public static void fizzBuzz(int num){
        for(int i=0;i<=num;i++){
            System.out.println(response(i));
        }
    }
    public static String response(int i){
        if(i%15==0){
            return FIZZ + BUZZ;
        }else if (i % 5 == 0 || hasFive(i)){
            return BUZZ;
        }else if(i%3==0 || hasThree(i)){
            return FIZZ;
        }
        return Integer.toString(i);
    }
    private static boolean hasThree(int num) {
        String label = Integer.toString(num);
        int index =label.indexOf("3");
        if(index>=0) {
            return true;
        }
        return false;
    }
    private static boolean hasFive(int num) {
        String label = Integer.toString(num);
        int index =label.indexOf("5");
        if(index>=0) {
            return true;
        }
        return false;
    }
}
