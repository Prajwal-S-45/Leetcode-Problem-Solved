// class Solution {
//     public void moveZeroes(int[] nums) {
//         int count = 0;
//         for(int i=0;i < nums.length;i++){
//             if(nums[i] == 0){
//                 count ++;
//             }
//             else if(count > 0){
//                 int temp = nums[i];
//                 nums[i] = 0;
//                 nums[i - count] = temp;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        int readIndex = 0;

        while(readIndex < nums.length){
            if(nums[readIndex] != 0){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
            readIndex++;
        }
        while(writeIndex < nums.length){
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }
}