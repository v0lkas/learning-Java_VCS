package vcs.lesson_02;

import java.util.*;

public class tasks_scanner_quiz {
    public static void main(String[] args) {
        /*
        String klausimai[] = new String[7];             String atsakymai[] = new String[7];
        klausimai[0] = "5 * 8 = ";                      atsakymai[0] = "40";
        klausimai[1] = "A, C, E, ?";                    atsakymai[1] = "G";
        klausimai[2] = "5 - 3 = ";                      atsakymai[2] = "2";
        klausimai[3] = "9 / 3 = ";                      atsakymai[3] = "3";
        klausimai[4] = "4 - 2 * 2";                     atsakymai[4] = "0";
        klausimai[5] = "Apple įkūrėjo pavardė?";        atsakymai[5] = "Jobs";
        klausimai[6] = "Kiek centų yra 2 euruose?";     atsakymai[6] = "200";
        */

        /*
        String[] klausimai = {
                "5 * 8 = ",
                "A, C, E, ?",
                "5 - 3 = ",
                "9 / 3 = ",
                "4 - 2 * 2",
                "Apple įkūrėjo pavardė?",
                "Kiek centų yra 2 euruose?"
        };
        String[] atsakymai = {
                "40",
                "G",
                "2",
                "3",
                "0",
                "Jobs",
                "200"
        };
        */

        /*
        Scanner viktorina = new Scanner(System.in);

        int teisingu = 0;

        for (int i=0; i<klausimai.length; i++) {
            System.out.println(klausimai[i]);
            String ats = viktorina.next();
            if(ats.equals(atsakymai[i])) {
                ++teisingu;
            }
        }

        if(teisingu >= 5) {
            System.out.println("VALIO");
        }
        else {
            System.out.println("Teisingų atsakymų: "+teisingu+" iš "+klausimai.length);
        }
        */

        HashMap quiz = new HashMap();
        quiz.put("5 * 8 = ",                        new String("40"));
        quiz.put("A, C, E, ? ",                     new String("G"));
        quiz.put("5 - 3 = ",                        new String("2"));
        quiz.put("9 / 3 = ",                        new String("3"));
        quiz.put("4 - 2 * 2 = ",                    new String("0"));
        quiz.put("What is Apple founder name? ",    new String("Jobs"));
        quiz.put("How much cents are in 2 Euro? ",  new String("200"));

        HashMap<Object,String> errs = new HashMap();

        Set set = quiz.entrySet();
        Iterator i = set.iterator();

        Scanner answers = new Scanner(System.in);

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();

            System.out.print(me.getKey());

            String answer = answers.next();

            if(!answer.toLowerCase().equals(me.getValue().toString().toLowerCase())) {
                errs.put(me.getKey(),me.getValue().toString());
            }
        }
        
        System.out.println();

        int total = errs.size();
        if(total == 0) {
            System.out.println("EVERYTHING CORRECT!");
        }
        else {
            if(total <= 2) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("Incorrect!");
            }

            System.out.println();
            System.out.println("Correct answers: ");

            Set set2 = errs.entrySet();
            Iterator i2 = set2.iterator();

            while(i2.hasNext()) {
                Map.Entry me2 = (Map.Entry)i2.next();
                System.out.println(me2.getKey() + me2.getValue().toString());
            }
        }
    }
}
