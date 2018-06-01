package vcs.lesson_15;

import java.util.ArrayList;
import java.util.List;

class A20 {
    @Override
    public boolean equals(Object o) {
        return true;
    }
}

class B20 extends A20 {
    @Override
    public boolean equals(Object o) {
        return o instanceof B20;
    }
}

class C20 extends A20 {
    static int count = 1;

    @Override
    public boolean equals(Object o) {
        count++;
        return (count % 2 < 0 ? true : false);
    }
}

public class test_20 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(new A20());

        System.out.println(l.contains(new A20()));
        System.out.println(l.contains(new B20()));
        System.out.println(l.contains(new C20()));

        l.add(new B20());
        l.add(new C20());

        System.out.println(l.contains(new A20()));
        System.out.println(l.contains(new B20()));
        System.out.println(l.contains(new C20()));
    }
}
