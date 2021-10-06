public class Test {

    @org.junit.Test
    public void day01() {
        int num[][] = {{1, 4, 6, 28},
                {2, 7, 32, 30},
                {10, 11, 67, 79}};
        Day01 one = new Day01();
        boolean b = one.Find(32, num);
        System.out.println(b);
    }

    @org.junit.Test
    public void day02() {
        Day02 two = new Day02();
        String str ="We Are Happy";
        StringBuffer buffer = new StringBuffer(str);
        //方法一
        String st=two.replaceSpace(str);
        System.out.println(st);
        //方法二
        String st2=two.replaceSpace2(buffer);
        System.out.println(st2);
        //方法三
        String st3=two.replaceSpace2(buffer);
        System.out.println(st3);
    }
}
