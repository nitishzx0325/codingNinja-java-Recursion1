public class FirstIndex {
    
    public static int first(int arr[],int x){
        int st=0;
        return firstHelper(arr,x,st);
    }

    private static int firstHelper(int[] arr, int x, int st) {
        if(st==arr.length){
            return -1;

        }
        if(arr[st]==x){
            return st;
        }
        int sa=firstHelper(arr, x, st+1);
        return sa;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,54};
        System.out.println(first(arr, 54));
    }
}
