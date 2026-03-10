class Solution {
    int missingNum(int arr[]) {
            long s=0,n=arr.length+1;
            for(int i = 0 ; i <arr.length;i++)
            {
                s+=arr[i];
            }
            return (int) ((n*(n+1))/2 - s);
        
    }
}