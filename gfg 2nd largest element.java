class Solution {
    public int getSecondLargest(int[] arr) {
        
        Arrays.sort(arr);
        int lar = arr[arr.length-1];
        
        for(int i = arr.length-2;i >= 0 ; i--)
        {
            if(arr[i]!=lar)
            return arr[i];
        }
        
        return -1;
    }
}