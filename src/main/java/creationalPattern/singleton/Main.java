package creationalPattern.singleton;

public class Main {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        System.out.println(s1==s2); // singleton incearca mereu sa intoarca aceeasi referinta pt toate obiectele

        System.out.println("--------------------------------------------------------");
        //acum facem noi un singleton

        SingletonClass class1 = SingletonClass.getInstance();
        SingletonClass class2 = SingletonClass.getInstance();
        System.out.println(class1==class2);

        class1.setA(5);
        System.out.println(class2.getA());



    }
}
