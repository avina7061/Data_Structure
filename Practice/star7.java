package Data_Structure.Practice;public class star7 {
    public static void main(String[] args) {
        for(int i =0; i<5; i++){
            for(int j =0;j<5; j++){
                int a = Math.min(Math.min(i,j),Math.min(5-i-1,5-j-1));
                System.out.print(3-a+" ");
            }
            System.out.println();
        }
    }

}
