package Data_Structure.Linked_List;

public class star5
{
    public static void main(String agrs[])
    {
        int x=13;
        int mid = (x/2)+1;
        for(int i=0;i<=x/2;i++)
        {
            for(int j=1;j<=x;j++)
            {
                if(i==0 && j==mid)
                {
                    System.out.print("*");
                    break;
                }
                if(i==(x/2))
                {
                    System.out.print("*");
                }
                else
                {
                    if(j==mid || j==(x-mid)+1)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
            mid = mid -1;
            System.out.println();
        }
    }
}