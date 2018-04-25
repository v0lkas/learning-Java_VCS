package vcs.pamoka02;

import java.util.*;

public class scanner_if {

    /*
    public static void main(String[] args) {
        int amzius = klauskAmziaus();

        if(amzius < 0) {
            System.out.println("Dar negimei?");
        }
        else if(amzius > 100) {
            System.out.println("Kaip tu nemyli SoDros.");
        }
        else if(amzius >= 40 && amzius <= 60) {
            System.out.println("Tarp tėvo ir senelio.");
        }
        else {
            System.out.println("Arba senas, arba naujas.");
        }
    }

    public static int klauskAmziaus() {
        Scanner metai = new Scanner(System.in);
        System.out.println("Amžius?");

        int amzius = metai.nextInt();

        return amzius;
    }
    */

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

        HashMap vika = new HashMap();
        vika.put("5 * 8 = ",                    new String("40"));
        vika.put("A, C, E, ? ",                 new String("G"));
        vika.put("5 - 3 = ",                    new String("2"));
        vika.put("9 / 3 = ",                    new String("3"));
        vika.put("4 - 2 * 2 = ",                new String("0"));
        vika.put("Apple įkūrėjo pavardė? ",     new String("Jobs"));
        vika.put("Kiek centų yra 2 euruose? ",  new String("200"));

        HashMap<Object,HashMap<Object,String>> errs = new HashMap();

        Set set = vika.entrySet();
        Iterator i = set.iterator();

        Scanner viktorina = new Scanner(System.in);

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();

            System.out.print(me.getKey());

            String ats = viktorina.next();
/*
            if(!ats.equals(me.getValue())) {
                errs.put(me.getKey(),new HashMap(me.getValue(),ats));
            }
            */
        }
       System.out.println();

        int total = errs.size();
        if(total == 0) {
            System.out.println("VISKAS TEISINGAI!");
        }
        else {
            if(total <= 2) {
                System.out.println("Testas išspręstas GERAI!");
            }
            else {
                System.out.println("Testas išspręstas BLOGAI!");
            }

            System.out.println();
            System.out.println("Teisingi atsakymai: ");

            Set set2 = errs.entrySet();
            Iterator i2 = set2.iterator();

            while(i2.hasNext()) {
                Map.Entry me2 = (Map.Entry) i2.next();

                String tValue = ""+ me2.getValue();
                String[] parts = tValue.split(":::");
                System.out.println(me2.getKey() +" "+parts[1]+" (NE '"+parts[0]+"')");
            }
        }
    }
}
