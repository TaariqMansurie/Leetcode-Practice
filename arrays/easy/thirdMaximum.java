public class thirdMaximum {

    public static int thirdMax(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++){
            int n = (int) i;

            if(n == first || n == second || n == third){
                continue; // skip duplicates
            }

            if(n > first){
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if(n > third){
                third = n;
            }
        }

        return third == Integer.MIN_VALUE ? first : third;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(thirdMax(nums));
    }
}
