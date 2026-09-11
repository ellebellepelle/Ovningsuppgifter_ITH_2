package me.ellebelle;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // 1.
        loop_1_16();
        System.out.println(loop_1_16_sum());
        ArrayList<Integer> numberList = loop_1_16_ArrayList();
        System.out.println(numberList);
        System.out.println(loop_1_16_ArrayList());  // sparar inte listan, skriver bara ut den.


        // 2.
        talet_65536();
        talet_65536_igen();
        talet_65536_igen_igen();


        // 3.
        System.out.println(antalTrueFalse());
        boolean[] values = {true, true, true, true, true, false};
        System.out.println(antalTrueFalse_igen(values));
        boolean[] values_igen = {};
        System.out.println(antalTrueFalse_igen_igen(values_igen));


        // 4.
        /*
        Skriv ett program som loopar och frågar användaren efter en sträng.
        Så länge som strängen inte är en tom sträng så ska programmet lägga
        ihop den med tidigare strängar, med ett mellanrum. Om användaren t.ex.
        har skrivit "ord1" tidigare och skriver "ord2" ska den nya strängen
        bli "ord1 ord2". Fortsätt loopa tills användaren skickar en tom sträng
        eller en punkt.
         */

        IO.println("skriv ett ord: ");
        String userInput = IO.readln();
        String result = "";

        while (!userInput.equals(".") && !userInput.isEmpty()) {
            result = result + " " + userInput;
            IO.println("skriv ett ord: ");
            userInput = IO.readln();
        }
        IO.print(result);

        // jag trodde att denna uppgiften skulle gå ut på att jag skriver ett ord och sen läggs det ihop
        // med nåsta ord, och sen skriver jag ett nytt ord och så lades det ihop med nästa ord coh samtidigt
        // skrevs det ut narje gång undertiden.
        // utskrivten nu blir att jag bara skriver in ord och när jag är klar så skrivs alla ut samtidigt.

        /*
            IO.println("Skriv ett ord:");
            String userInput =IO.readln();
            String result="";
            //här loopar den så länge input INTE är . eller blankt
            while (!userInput.equals(".")&&!userInput.isEmpty()) {
                result = result + " " + userInput;
                IO.println("Skriv ett ord:");
                userInput =IO.readln();
            }
            IO.println(result);
        */


        System.out.println("\n");
        boolean proceed = true;
        String result2 = "";

        while (proceed) {
            System.out.println("skriv ett ord: ");
            String userInput2 = IO.readln();

            if (userInput2.isBlank())
                proceed = false;
            else if (userInput2.equals(".")) {
                result2 = result2 + userInput2;
                proceed = false;
            }
            else if (result2.isEmpty()) {
                result2 = userInput2;
            }
            else
                result2 = result2 + " " + userInput2;
        }

        IO.println(result2);


        /*
         boolean proceed = true;
        String string = "";

        while (proceed) {
            String input = IO.readln("Write a word: ");
            if (input.isBlank())
                proceed = false;
            else if (input.equals(".")) {
                string = string + input;
                proceed = false;
            } else if (string.isEmpty())
                string = input;
            else
                string = string + " " + input;
        }

        IO.println(string);
    }
         */





        /*
        String[] text={};

        for (int i = 0; i < (text.length +1); i++) {
            IO.println();
            String[] newWord = Arrays.copyOf(text, (text.length + 1));
            newWord[i] = IO.readln("Skriv ett ord/sträng: ");

                if (newWord[i].equals("") || newWord[i].equals("."))
                    return;

                else {
                    text = Arrays.copyOf(newWord, newWord.length);
                    for (int j = 0; j < text.length; j++)
                        IO.print(text[j] + " ");
                }
        }
        */




        // 5.
        /*
        Skriv ett program som frågar användaren efter ett tal mellan 1 och 100.
        Programmet ska ha ett hemligt tal lagrat i en variabel. Det ska fortsätta
        fråga användaren till dess att användaren gissar det hemliga talet.
        Om man gissade för högt eller för lågt så ska det skrivas ut, så att
        användaren har en rimlig chans att klara det.
         */

        int hemligtTal = (int) (Math.random() * 100) + 1;
        // int hemligtTal = 20;
        int counter = 0;
        boolean contine = true;
        while (contine) {
            System.out.println("skriv ett tal mellan 1-100 för att gissa det hemliga talet.");
            String input = IO.readln();

            try {
                int tal = Integer.parseInt(input);
                if (tal > 0 && tal < 101) {
                    counter++; // counter = counter + 1;
                    System.out.println("Du skrev talet: " + tal);
                    if (tal > hemligtTal) {
                        System.out.println("Ditt tal är större än det hemliga talet.");
                    } else if (tal < hemligtTal) {
                        System.out.println("Ditt tal är mindre än det hemliga talet.");
                    } else if (tal == hemligtTal) {
                        System.out.println("Du gissade rätt!! det var " + hemligtTal + " och du gissade " + tal);
                        System.out.println("Du gissade " + counter + " gånger");
                        contine = false;
                    } else
                        System.out.println("Talet måste vara mellan 1-100");
                }
            } catch (NumberFormatException e) {
                System.out.println("Du måste skriva ett heltal mellan 1-100");
            }
        }


        // 6.
        // Vad skriver följande program ut? Svar--> #.... .#... ..#.. ...#. ....#

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (x == y)
                    System.out.println("#");
                else
                    System.out.println(".");
            }
            System.out.println(" ");
        }




        // 7.
        /*
        Skapa ett program som beräknar summan av alla element i en array.
        Deklarera en array int[] numbers = {5, 12, 8, 21, 3};
        Räkna nu ut summan av talen i arrayen med hjälp av en loop.
        Hur kan vi hitta det största och minsta värdet i arrayen?
         */

        int[] lista = {5, 12, 8, 21, 3};
        int sum = 0;
        int minsta = lista [0];
        int storsta = lista[0]; // innan jag börjar jämföra antar jag att första talet är störst.
        for (int nummer : lista) {
            sum = sum + nummer;
            if (nummer > storsta)
                storsta = nummer;
            if (nummer < minsta)
                minsta = nummer;
        }
        System.out.println(sum);
        System.out.println(minsta);
        System.out.println(storsta);




    }


    // 1.
    public static void loop_1_16() {
        for (int i = 1; i < 17; i++)
            System.out.println(i);
    }

    public static int loop_1_16_sum() {
        // behöver nästa varv veta vad som hände i tidigare varvet? ja -> variabel behövs.
        int sum = 0;
        for (int i = 1; i < 17; i++)
            sum += i;  // sum = sum + i;
        return sum;
    }

    public static ArrayList<Integer> loop_1_16_ArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 17; i++)
            numbers.add(i);
        return numbers;
    }


    // 2.
    public static void talet_65536() {
        int number = 65536;
        while (number > 2) {
            System.out.println(number);
            number = number / 2;
        }
    }

    public static void talet_65536_igen() {
        for (int number = 65536; number > 2; number /= 2) // /= --> number = number / 2
            System.out.println(number);
    }

    public static void talet_65536_igen_igen() {
        int number = 65536;
        while (number > 2) {
            System.out.println(number);
            number = number >> 1;   // number >>=1;
        }
    }


    // 3.
    public static int antalTrueFalse() {
        boolean[] valueTrue = {true, false, true, false};
        int count = 0;
        for (int i = 0; i < valueTrue.length; i++) {
            if (valueTrue[i]) {
                count++;
            }
        }
        return count;
    }
    public static int antalTrueFalse_igen(boolean[] valueTrue) {
        int count = 0;
        for (int i = 0; i < valueTrue.length; i++) {
            if (valueTrue[i]) {
                count++;
            }
        }
        return count;
    }
    public static int antalTrueFalse_igen_igen(boolean[] valueTrue) {
        int count = 0;
        for (boolean value : valueTrue) {
            if (value) {
                count++;
            }
        }
        return count;
    }


    // 4.




    // 5.




    // 6.




    // 7.
}


