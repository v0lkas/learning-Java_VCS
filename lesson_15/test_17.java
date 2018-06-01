package vcs.lesson_15;

interface ABC17 {
    public void sayAbc();
}

interface DEF {
    public void sayAbc();
}

class A17 implements ABC17 {
    public void sayAbc() {
        System.out.println("abc!");
    }
}

class B17 extends A17 {
    public void sayAbc() {
        super.sayAbc();
        System.out.println("ABC!");
    }
}

class C17 extends A17 implements DEF {
    public void sayAbc() {
        System.out.println("ABC!");
    }
}

public class test_17 {

    public static void say(Object o) {
        if(o == null) return;
        if(o instanceof A17) System.out.println("A");
        if(o instanceof B17) System.out.println("B");
        if(o instanceof C17) System.out.println("C");
        if(o instanceof ABC17) System.out.println("ABC");
        if(o instanceof DEF) System.out.println("DEF");
    }

    public static void main(String[] args) {
        ABC17[] m = { new A17(), new B17(), new C17(), null };
        for(ABC17 abc17 : m) {
            say(abc17);
        }
    }
}
