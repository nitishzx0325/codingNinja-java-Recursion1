public class CheckSumOfNumber {
    
    public static int sumOfDigit(int n){
        if(n<10){
            return n;
        }
        int sa=n%10+sumOfDigit(n/10);
        return sa;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }
}
