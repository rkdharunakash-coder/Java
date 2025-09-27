import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int n=op.nextInt();
        int m=op.nextInt();
        int sum1=0;
        int sum2=0;
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=op.nextInt();
                if(i==j) sum1+=a[i][j];
                if(i+j==n-1) sum2+=a[i][j];
            }
            
        }
        System.out.println(sum1 +" "+sum2 );
    }
}