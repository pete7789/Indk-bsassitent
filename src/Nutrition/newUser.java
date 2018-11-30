package Nutrition;

import java.io.IOException;

import static java.lang.System.out;

public class newUser{

    public static void main(String[] args) throws IOException {
        kcalcalcu newuser1 = new kcalcalcu();
        pressAnyKeyToContinue();
        dtugetinfo dtuinfo = new dtugetinfo().getInfo();


    }

    private static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to print out Food Data...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
