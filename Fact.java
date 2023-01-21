public class Fact{

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int sa=fact(n-1);
        return n*sa;
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}