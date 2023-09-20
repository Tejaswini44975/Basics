class Solution
{
    int thirdLargest(int a[], int n)
    {
        int first_max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>first_max)
            {
                first_max=a[i];
            }
        }
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>second_max && a[i]<first_max)
            {
                second_max=a[i];
            }
        }
        int third_max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>third_max && a[i]<second_max && a[i]<first_max)
            {
                third_max=a[i];
            }
        }
        return third_max;
	    
    }
}

