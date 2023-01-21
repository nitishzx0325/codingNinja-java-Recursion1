public class TotalDigit {
    
    public static int digits(int n){
        if(n==0){
            return 0;
        }
    
        int sa= digits(n/10);
        return sa+1;
    }
    public static void main(String[] args) {
        System.out.println(digits(125));
    }
}
