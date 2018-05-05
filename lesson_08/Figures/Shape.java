package vcs.lesson_08.Figures;

public class Shape {
    private static int qntt;

    public Shape() {
        qntt++;
    }

    public static int getQntt() {
        return qntt;
    }
}
