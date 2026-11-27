class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
        hs.add(num);
        }

        for(Integer currNum: hs ){
            if(hs.contains(currNum - 1) == false ) {
                list.add(currNum);
            } 
        }
        int len = 0;
        int max = 0;
        for(Integer potential: list){
            len = 1;
                while(hs.contains(potential+1) ) {
                    potential = potential+1;
                    len++;
                }
                if(len > max ) max = len;    
        }

        return max;
    }
}
