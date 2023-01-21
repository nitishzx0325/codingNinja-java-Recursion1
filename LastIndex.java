public class LastIndex {
    
    public static int last(int arr[],int x){
        int st=0;
        return lastHelper(arr,x,st);
    }
    private static int lastHelper(int[] arr, int x, int st) {
        if(st==arr.length){
            return -1;
        }
        int i=-1;
        if(arr[st]==x){
            i=st;
        }
        int sa=lastHelper(arr, x, st+1);
        if(sa>i){
            return sa;
        }
        else
        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,54,4};
        System.out.println(last(arr, 4));
    }
}
