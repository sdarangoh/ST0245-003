
/**
 * Here are de code foor the exercises of Array 3 in codinbat
 * 
 * @author Samuel David Ben Jacob Arango Henao 
 * @version 1
 */
public class Array3
{
    public boolean canBalance(int[] nums) {
        boolean can = false;
        for(int k = 0; k < nums.length; k++){
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < k; i++){
                sum1 = sum1 + nums[i]; 
            }
            for(int j = k; j < nums.length; j++){ 
                sum2 = sum2 + nums[j];
            }
            if(sum1 == sum2){
                can = true;
            }
        }
        return can;
    }

    public int countClumps(int[] nums) {
        int clumps = 0;
        int k = 0;
        int count = 0;
        while(k < (nums.length - 1)){
            int i = k + 1;
            while((i < nums.length) && (nums[k] == nums[i])){
                if(count == 0){
                    count = 1;
                }
                i++;
            }
            k = i;
            clumps = clumps + count;
            count = 0;
        }
        return clumps;
    }

    public int maxSpan(int[] nums) {
        int max = 0, l = 0, r = 0, span = 0;
        for(int k = 0; k < nums.length; k++){
            for(int i = k; i  < nums.length; i++){
                if(nums[k] == nums[i]){ 
                    for(int j = k; j <= i; j++){
                        span = span + 1;
                    }
                    if(span > max){
                        max = span;
                    }
                }
                span = 0;
            }
        }
        return max;
    }

    public int[] seriesUp(int n) {
        int[] serie = new int[n*(n+1)/2];
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                serie[k] = j+1;
                k++;
            }
        }
        return serie;
    }

    public int[] squareUp(int n) {
        int[] square = new int[n*n];
        int k = n*n - 1;
        int l = 1;
        int m = n;
        for(int i = 0; i < n; i++){
            for(int j = k; j > k - n; j --){
                if(l > m){
                    square[j] = 0;
                    l++;
                }
                else{
                    square[j] = l;
                    l++;
                }
                if (l > n){
                    l = 1;
                }
            }
            k = k - n;
            m = m - 1;
        }
        return square;
    }
}
