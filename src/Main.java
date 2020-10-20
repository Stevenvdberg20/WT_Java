import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String woord = sc.next();
        // char[] ca = woord.toCharArray();
        // Arrays.sort(ca);
        // System.out.println(ca);
        /*
        System.out.println("Wat is het Lingo woord?");
        String lingoWoord = sc.next();
        String geheim = "";
        System.out.print(geheim);
        boolean geraden = false;
        String goedeTweeReeks = "2".repeat(lingoWoord.length());
        System.out.println(goedeTweeReeks);

        while (!geraden) {
            String antwoord = "";
            for (int i = 0; i < lingoWoord.length(); i++) {
                geheim += "_ ";
            }

            System.out.println("Gok een woord");
            String gok = sc.next();
            for (int i = 0; i < gok.length(); i++) {
                if (gok.charAt(i) == lingoWoord.charAt(i)) {
                    antwoord += "2";
                } else if (lingoWoord.contains(String.valueOf(gok.charAt(i))) && gok.charAt(i) != lingoWoord.charAt(i)) {
                    antwoord += "1";
                } else {
                    antwoord += "0";
                }
            }
            System.out.println(antwoord);
            if (Integer.parseInt(goedeTweeReeks) == Integer.parseInt(antwoord)) {
                System.out.println("Correct, het goede antwoord is" + lingoWoord);
                geraden = true;
            }

        }

         */
        Kapitein kappie = new Kapitein("Kapitein Kappie");
        Boot botie = new Boot();
        Speedboot speedy = new Speedboot();
        kappie.varen(botie);
        kappie.varen(speedy);

        boolean loop = true;
        String vorige = "";
        int loopcounter = 0;
        String reislijst = "Gezegd is: ";
        System.out.print(reislijst);
        while(loop) {
            String volgende = sc.next().toLowerCase();
            if (loopcounter != 0 && vorige.charAt(vorige.length()-1) == volgende.charAt(0)) {
                vorige = volgende;
                reislijst += volgende + ", ";
                loopcounter++;
            } else if (loopcounter == 0) {
                vorige = volgende;
                reislijst += volgende + ", ";
                loopcounter++;
            } else if (volgende.equals("klaar")) {
                loop = false;
                System.out.println(reislijst.substring(0, reislijst.length()-2));
                break;
            } else {
                System.out.println("Geen juist woord gekozen!");
                continue;
            }
            System.out.println(reislijst);
        }
    }
}
