package ra;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        return number<0 ? -number : number ;
    }
    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
