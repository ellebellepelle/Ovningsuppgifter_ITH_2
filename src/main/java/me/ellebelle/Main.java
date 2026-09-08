package me.ellebelle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        loop_1_16();
        System.out.println(loop_1_16_sum());

        }

    public static void loop_1_16() {
        for (int i = 1; i < 17; i++)
            System.out.println(i);
    }
        public static int loop_1_16_sum() {
        int sum = 0;
            for ( int i = 1; i < 17; i++)
                sum += i;  // sum = sum + i;
            return sum;
        }

}
