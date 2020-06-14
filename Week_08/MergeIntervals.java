//Given a collection of intervals, merge all overlapping intervals. 
//
// Example 1: 
//
// 
//Input: [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
// 
//
// Example 2: 
//
// 
//Input: [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping. 
//
// NOTE: input types have been changed on April 15, 2019. Please reset to defaul
//t code definition to get new method signature. 
// Related Topics 排序 数组

  
package cn.com.myproject.learn.leetcode.editor.cn;

import java.util.Arrays;

public class MergeIntervals{
    public static void main(String[] args) {
       Solution solution = new MergeIntervals().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {
            // 先按照区间起始位置排序
            Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
            // 遍历区间
            int[][] res = new int[intervals.length][2];
            int idx = -1;
            for (int[] interval: intervals) {
                // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
                // 则不合并，直接将当前区间加入结果数组。
                if (idx == -1 || interval[0] > res[idx][1]) {
                    res[++idx] = interval;
                } else {
                    // 反之将当前区间合并至结果数组的最后区间
                    res[idx][1] = Math.max(res[idx][1], interval[1]);
                }
            }
            return Arrays.copyOf(res, idx + 1);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}