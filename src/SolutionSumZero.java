package java;

public class SolutionSumZero
{
    public int[] sumZero(int n) {
        int [] arr = new int[n];

        if(n == 0)
        {
            return arr;
        }
        if(n == 1)
        {
            arr[0] = 0;
            return arr;
        }
        else
        {
            if(n%2 == 0){
                generator(arr,n,0);
            }
            else
            {
                arr[0] = 0;
                generator(arr,n,1);
            }
        }
        return arr;
    }
    private void generator(int [] arr, int n, int startIndex)
    {
        for(int i = startIndex; i<n;i++)
        {
            arr[i] = i;
            if(n%2 == 0)
            {
                arr[n-i-1] = -i;
            }
            else{
                arr[n-i] = -i;
            }

        }

    }
}
