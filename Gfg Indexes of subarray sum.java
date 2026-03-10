
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> re= new ArrayList<>();
        int f =0,s=0;
        for(int e = 0 ; e < arr.length;e++)
        {
            s+=arr[e];
            
            while(s>target){
                s-=arr[f];
                f++;
            }
        
                if(s==target)
                {
                   re.add(f+1);re.add(e+1);
                   return re;
                }
            }
         
    re.add(-1);
    return re;
    }
}
