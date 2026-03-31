
public class movezeroes {    
    public static void main(String[] args) {
        int nums[] = {0,1,1,0,2};
        int size = nums.length;
        if(size == 0 || size == 1){
            return ;
        }
        int nz=0,z=0;
        while(nz < size){
            if(nums[nz] != 0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

