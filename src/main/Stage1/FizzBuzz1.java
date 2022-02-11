package main.Stage1;


public class FizzBuzz1
{
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static void main(String[] args) {
        System.out.println("Debut de FizzBuzz");
       FizzBuzz1.fizzBuzz(100);
    }
    public static void fizzBuzz(int num) {
        for(int i=0;i<=num;i++){
            System.out.println(response(i));
        }
    }
    public static String response(int i){
        //comme il est divisible par 3 et 5 donc on peut en deduire il est divisble par 15
        if(i%15==0){
            return FIZZ + BUZZ;
        }else if (i%5==0){
            return BUZZ;
        }else if(i%3==0){
            return FIZZ;
        }
        return Integer.toString(i);
    }

}