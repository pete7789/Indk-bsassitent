package Nutrition;

import java.io.IOException;

public class main {



    public static void main(String[] args) throws IOException {
        //newUser user = new newUser();
        //printData();
        new eatingFood();


    }

    private static void printData() throws IOException {
        pressEnterKeyToPrintData();
        dtugetinfo dtuinfo = new dtugetinfo().getInfo();

    }

    private static void pressEnterKeyToPrintData() {
        System.out.println("Press Enter key to print out Food Data...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
