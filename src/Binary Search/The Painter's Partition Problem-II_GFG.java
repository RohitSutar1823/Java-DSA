class Solution {
    
    static boolean isValidSolution(int [] arr, int k, int mid){
        int painterCount = 1;
        int paintedLength = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(paintedLength + arr[i] <= mid){
                paintedLength = paintedLength + arr[i];
            }
            else{
                painterCount++;
                paintedLength = 0;
                if(painterCount > k || arr[i] > mid){
                    return false;
                }
                else{
                    paintedLength = paintedLength + arr[i];
                }
                
            }
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        
        int s = 0;
        int e = sum;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValidSolution(arr,k,mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
        
    }
}