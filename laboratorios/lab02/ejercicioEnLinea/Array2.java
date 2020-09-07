
/**
 * Here are the exercises from Array-2 of codingbat
 * 
 * @author Samuel David Ben Jacob Arango Henao 
 * @version 1
 */
public class Array2
{
    public int[] fizzArray(int n) {
        int [] fizz = new int[n];
        for(int i = 0; i < n; i++){
            fizz[i] = i;
        }
        return fizz;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] FB = new String[end - start];
        for(int i = 0; i < FB.length; i++){
            if((start + i) % 3 == 0 && (start + i) % 5 == 0){
                FB[i] = "FizzBuzz";
            }
            else if((start + i) % 3 == 0){
                FB[i] = "Fizz";
            }
            else if((start + i) % 5 == 0){
                FB[i] = "Buzz";
            }
            else{
                FB[i] = String.valueOf((start + i));
            } 
        }
        return FB;
    }

    public boolean lucky13(int[] nums) {
        boolean lucky = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1 || nums[i] == 3){
                lucky = false;
            }
        }
        return lucky;
    }

    public boolean modThree(int[] nums) {
        boolean modThree = false;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0){ 
                modThree = true;}
            if(nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0){
                modThree = true;
            }
        }
        return modThree;
    }

    public boolean more14(int[] nums) {
        int uno = 0, cuatro = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) uno = uno + 1;
            if(nums[i] == 4) cuatro = cuatro + 1;
        }
        if(uno > cuatro) return true;
        else return false;
    }

    public boolean only14(int[] nums) {
        boolean only = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 1 && nums[i] != 4) only = false;
        }
        return only;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length;  i++){
            if(nums[i] == 2){
                sum = sum + 2;
            }
        }
        if (sum == 8) return true;
        else return false;
    }

    public boolean twoTwo(int[] nums) {
        boolean twoTwo = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                if (i != 0 && nums[i - 1] == 2){
                    twoTwo = true;
                }
                else{twoTwo = false;}
            }
        }
        return twoTwo;
    }

    public int[] zeroMax(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                for (int j = i; j < nums.length; j++){
                    if(nums[j]%2 != 0 && nums[j] > nums[i]){
                        nums[i] = nums[j];
                    }
                }
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int [] oddEven = new int[nums.length];
        int  j = 0;
        for(int k = 0; k <= 1; k++){
            for(int i = 0; i < nums.length; i++){
                if(k == 0){
                    if(nums[i] % 2 == 0){
                        oddEven[j] = nums[i];
                        j++;
                    }
                }
                else{
                    if(nums[i] % 2 != 0){
                        oddEven[j] = nums[i];
                        j++;
                    }
                }
            }
        }
        return oddEven;
    }

    public boolean haveThree(int[] nums) {
        int tres = 0;
        boolean haveTres = false;
        if(nums.length < 5){return haveTres;}
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                if(i == 0 && nums[i + 1] != 3){tres = tres + 1;}
                else if(nums[i - 1] != 3){tres = tres + 1;}
            }
        }
        if(tres == 3){ haveTres = true;}
        return haveTres;
    }

    public int[] notAlone(int[] nums, int val) {
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] == val && (nums[i + 1] != val && nums[i - 1] != val)){
                if(nums[i + 1] > nums[i - 1]){
                    nums[i] = nums[i + 1];
                }
                else {nums[i] = nums[i - 1];}
            }
        }
        return nums;
    }
}
