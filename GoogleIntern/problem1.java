package Data_Structure.GoogleIntern;

public class problem1 {
    public static int solve(int arr[], int i, int evenCnt, int oddCnt,boolean empty){
        if(i>=arr.length){
            if(empty){
                return 1;
            }
            else{
                return 0;
            }
        }
        int take=0;
        int notTake=0;
        notTake+=solve(arr,i+1,evenCnt,oddCnt,empty);
        if(arr[i]%2==0&&evenCnt<2){
            take+=solve(arr,i+1,evenCnt+1,0,true);
        }
        else if(arr[i]%2!=0&&oddCnt<2){
            take+=solve(arr,i+1,0,oddCnt+1,true);
        }
        return take+notTake;
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 6, 7, 8, 6, 2, 9};
        int x = solve(arr,0,0,0,false);
        System.out.println(x);
    }
}
