public class Multiplication {
    
    public static int multi(int n,int x){
        if(x==0){
            return 0;
        }
        int sa=multi(n, x-1);
        return sa+n;
    }

    public static void main(String[] args) {
        System.out.println(multi(3, 5));
    }
}
