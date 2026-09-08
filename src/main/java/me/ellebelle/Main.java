package me.ellebelle;

import java.util.ArrayList;

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
        }






        // 1.
        public static void loop_1_16() {
        for (int i = 1; i < 17; i++)
            System.out.println(i);
        }
        public static int loop_1_16_sum() {
        // behöver nästa varv veta vad som hände i tidigare varvet? ja -> variabel behövs.
        int sum = 0;
            for ( int i = 1; i < 17; i++)
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
}


