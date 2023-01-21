public class Fabonacii {
    
    public static int faboo(int n){
        if(n==0||n==1){
            return n;
        }
        return faboo(n-1)+faboo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(faboo(3));
    }
}
