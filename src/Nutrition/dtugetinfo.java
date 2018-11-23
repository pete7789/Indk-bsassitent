package Nutrition;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class dtugetinfo{

    private static final String DTU_GET_INFO = "C:\\Users\\murat\\OneDrive\\Dokumenter\\Indk-bsassitent\\src\\Nutrition\\Fodevaredata_prog_v3_new.csv";

    public static void main(String[] args) throws IOException {
           try (
                Reader reader = Files.newBufferedReader(Paths.get(DTU_GET_INFO));
                CSVReader csvReader = new CSVReader(reader)
                )
        {
            String[] nextReading;
            while ((nextReading = csvReader.readNext()) != null) {
                if (nextReading[99].equals("")){
                    nextReading[99] = "0";
                }
                System.out.println("Food Name: " + nextReading[0]);
                System.out.println("kJ: " + nextReading[4] + " kJ");
                System.out.println("kcal: " + nextReading[5] + " kcal");
                System.out.println("Protein: " + nextReading[8] + "g");
                System.out.println("Carbohydrate: " + nextReading[10] + "g");
                System.out.println("Sugar: " + nextReading[99] + "g");
                System.out.println("Salt: " + nextReading[49] + "mg");
                System.out.println("Fat: " + nextReading[15] + "g");
                System.out.println("Saturated Fat: " + nextReading[159] + "g");
                System.out.println("--------------------------------------");

            }
        }
    }

}
