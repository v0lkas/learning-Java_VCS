package vcs.lesson_10;

public class try_catch {
    public static void main(String[] args) {

        try {
            voice("not test");
        } catch (Exception e) {
            System.out.println("this is not test");
        } finally {
            System.out.println("finished");
        }
    }

    public static void voice(String word) throws Exception {
        if(word.equals("test")) {
            System.out.println("Nepavyko");
        } else {
            throw new Exception("Ne ne ne");
        }
    }
}
