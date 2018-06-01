package vcs.lesson_15;

class A19 {
    public void sayAbc() throws Exception {
        System.out.println("abc!");
    }
}

class B19 extends A19 {
    @Override
    public void sayAbc() throws Exception {
        super.sayAbc();
        System.out.println("ABC!");
        throw new IndexOutOfBoundsException();
    }
}

class C19 extends A19 {
    public void sayAbc() throws Exception {
        System.out.println("!!!");
        throw new Exception();
    }
}

public class test_19 {
    public static void main(String[] args) {
        A19[] m = { new A19(), new B19(), new C19() };
        try {
            for(int i = 0; i <= m.length; i++) {
                m[i].sayAbc();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("-1");
        } catch (Exception e) {
            System.out.println("ERR");
        }
    }
}
