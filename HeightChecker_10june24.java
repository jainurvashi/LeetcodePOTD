import java.util.Arrays;

public class HeightChecker_10june24 {
    class Solution {
        public int heightChecker(int[] heights) {
            int[] data =heights.clone();
            int ans =0;
            Arrays.sort(data);
            for(int i=0;i<heights.length;i++){
                if(data[i]!=heights[i])
                    ans++;
            }
            return ans;
        }
    }
}
