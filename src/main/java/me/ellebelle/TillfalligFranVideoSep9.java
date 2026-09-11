package me.ellebelle;

public class TillfalligFranVideoSep9 {
    public static void main(String[] args) {
/*
        System.out.println("Voting registration v1.0");
        String[] names = new String[10];
        int[] eNumbers = new int[10];

        for (int i = 0; i < names.length; i++) {
            names[i] = IO.readln("Voter name: ");
            eNumbers[i] = Integer.parseInt(IO.readln("Envelope number: "));
        }

 */


        // ist för att använda ovan kod som sparar namn och eNummer parallelt med hjälp
        // av samma indexplats i arrayen så vill jag använda OOP och göra en egen datatyp.
        // så jag kan göra en array av tex voterInfo. Så den blir en egen datatyp (inte int inte String)
        // utan en voterInfo-typ som kan lagra flera värden i sig så att jag kan lagra både namnet
        // och kuvertnumret i sig. Det jag kan göra är att definiera en egen typ som innehåller flera
        // tillsammans och så kan jag göra objekt av dem.

        IO.println("Voting registration v1.0");
        // skapa en array med 10 platser där varje plats kan innehålla ett VoterInfo-objekt
        VoterInfo[] vInfo = new VoterInfo[10];

        int i = 0;
        while (i < vInfo.length) {
            String name = IO.readln("Voter name: ");
            int eNr = Integer.parseInt(IO.readln("Envelope number: "));
            // check if eNr is uniqe
            if (isEnvelopeNumberUnique(eNr, vInfo)) {
                // skapa ett objekt av VoterInfo-klassen/recordet
                VoterInfo voterInfo = new VoterInfo(name, eNr);
                // lägg in det objektet i plats i i vInfo-arrayen
                vInfo[i] = voterInfo;
            }
            else {
                IO.println("Invalid envelope number");
                i--;
                }
            i++;
        }
    }


    // metod för dubbel nr inmatning chec
    static boolean isEnvelopeNumberUnique(int eNr, VoterInfo[] vInfo) {
        for (int i = 0; i < vInfo.length; i++) {
            // vInfo[i] ger bara arrayens plats --> .eNumber() är en metod som tar ut numret från arrayens plats.
            if (vInfo[i] != null && eNr == vInfo[i].eNumber()) // must check for null to avoid NullPointerException
                return false;
        }
        return true;
    }

    /*
    och i dethär fallet så är det information som inte ska ändras så då använder jag ett keyword
    som heter record. Så jag bestämmer ett namn på min typ och lägger sedan till de värden jag
    vill kunna lagra i den typen.
     */

    // När denna körs är det som en metod ungefär fast det är en metod som körs när ett objekt
    // skapas i minnet och då kallas den för en konstruktor. och så skapas VoterInfo objektet.
    record VoterInfo(String name, int eNumber) {

    }




}
