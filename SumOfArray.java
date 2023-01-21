public class SumOfArray {
    
    public static int sum(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int sa[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            sa[i-1]=arr[i];
        }
        int sm=sum(sa);
        return arr[0]+sm;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sum(arr));
        
    }
}
