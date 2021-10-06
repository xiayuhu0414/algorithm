public class Day02 {
    /*
    * 实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为 We Are Happy.
    * 则经过替换之后的字符串为 We%20Are%20Happy.
    * */


    //方法一：直接使用replace()函数

    public String replaceSpace(String str){
        String result = str.toString().replace(" ","%20");
        return result;
    }

    //方法二
    /*
     * 1.将字符串转换成为字符数组，遍历⼀次，统计出空格的个数。
     * 2.构建出新的字符数组， 初始化的⼤⼩=原来的字符数组⻓度+空格⻓度x2
     * 3.遍历⼀次，复制，当不为空格时直接复制，当为空格时，则把%20 这三个字符
     * 复制过去。
     * */
    public String replaceSpace2(StringBuffer str){
        //a为原字符串长度，b为现字符串长度
        int b = str.length();
        int a = b;
        for (int i = 0; i < b; i++) {
            if (' ' == str.charAt(i)) {
                a += 2;
            }
        }
        //i为原字符串角标，j为现字符串角标
        int i = b - 1;
        int j = a - 1;
        str.setLength(a);//重新设置字符串长度
        while (i >= 0 && j >= i) {
            if (str.charAt(i) == ' ') {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            } else {
                str.setCharAt(j--, str.charAt(i));
            }
            i--;
        }
        return str.toString();
    }

//方法三 新数组存储
    public static String ReplaceSpace3(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}

