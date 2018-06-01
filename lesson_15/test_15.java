package vcs.lesson_15;

interface ABC {
    public void sayAbc();
}

class A15 implements ABC {
    @Override
    public void sayAbc() {
        System.out.println("abc!");
    }
}

public class test_15 {

    public static void main(String[] args) {
        A15 a15 = new A15();
        ABC b15 = new A15();
        //ABC abc = new ABC();  <-- crashes, if not overcommented

        a15.sayAbc();
        b15.sayAbc();
        //abc.sayAbc();         <-- crashes, if not overcommented
    }
}
