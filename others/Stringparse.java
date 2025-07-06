public class Stringparse {
    public static void main(String[] args) {
        String s = "2500";
        int a = Integer.parseInt(s);
        s = s + 1;
        a = a + 1;
        System.out.println(s);
        System.out.println(a);


        String s1 = "2500.215";
        double b = Double.parseDouble(s1);
        s1 = s1 + 1;
        b += 1;
        System.out.println(s1);
        System.out.println(b);

    }
}
