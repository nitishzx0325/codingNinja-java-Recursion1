public class GeoMetricSum {
    
    public static double sum(int n){
        if(n==0){
            return 1;
        }
        return 1+sum(n-1)/Math.pow(2, n);
    }

    public static void main(String[] args) {
     System.out.println(sum(3));   
    }
}
