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
}
