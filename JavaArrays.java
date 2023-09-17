class Compute
{
    String average(int A[], int N)
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+A[i];
            
        }
           double avg = (double)sum/N;
           String formattedAvg = String.format("%.2f", avg);
        
        return formattedAvg;
    }
}