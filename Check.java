public class Check {
    
    public static boolean check(int arr[],int x){
        if(arr.length==0){
            return false;
        }
        int sm[]=new int[arr.length-1];
        for(int i=1;i<sm.length;i++){
            sm[i-1]=arr[i];
        }
        boolean sa=check(sm,x);
        // if(!sa){}
        if(arr[0]==x){
            return true;
        }
        return sa;
    }

    public static void main(String[] args) {
        int arr[]={5,7,9,6,11};
        System.out.println(check(arr, 8));
    }
}
