
public class Day01 {
    /*
     * 题目描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断
     * 数组中是否含有该整数。
     *
     * 查找数字30，如果存在返回true。
     * */


    public boolean Find(int target, int[][] array) {
        int size = array.length;
        int length = array[0].length;
        System.out.println(size);
        System.out.println(length);
        int i, j;
        for (i = size - 1, j = 0; i >= 0 && i < size && j >= 0 && j < length; ) {
            if (array[i][j] == target) {
                return true;
            }
            if (array[i][j] < target) {
                j++;
                continue;
            }
            if (array[i][j] > target) {
                i--;
                continue;
            }
        }
        return false;
    }
}

/*
* 最坏的情况是遍历所有的元素才获得结果，如果数组的规模是n*m，那么时间复杂度就是O(n*m)。
* 选定左下⻆的10 ( num[2][0], i = 2, j = 0 )作为起点，如果⼤于10 ,
* 那么 i + 1 ,如果⼩于 10 ，则 j + 1 ，则下⼀个查找的数字是11 ,
* 我们知道 32 仍然⽐ 11 ⼤，则往右找到 67 ，继⽽ 32 ⽐ 67 ⼩，我们应该往上
* 找，找到了 32 。如果找 28 ，则是最坏的结果，查找知道数组的右上⻆结束，这样⼀来
* ，最坏的结果就是 O（n+m） 。
* */