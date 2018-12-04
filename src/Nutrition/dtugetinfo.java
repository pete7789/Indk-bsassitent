package Nutrition;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class dtugetinfo{
    private static final String DTU_GET_INFO = "src/Nutrition/Fodevaredata_prog_v3_new6.csv";

    public dtugetinfo getInfo() throws IOException{

        try (
                Reader reader = Files.newBufferedReader(Paths.get(DTU_GET_INFO));
        ) {

            CsvToBeanBuilder<FoodData> csvToBeanBuilder = new CsvToBeanBuilder(reader).withSeparator(',').withSkipLines(3);
            csvToBeanBuilder.withType(FoodData.class);
            csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
            CsvToBean<FoodData> csvToBean = csvToBeanBuilder.build();

            Iterator<FoodData> foodDataIterator = csvToBean.iterator();

            System.out.println("--------------------------------------");
            while (foodDataIterator.hasNext()) {
                FoodData foodData = foodDataIterator.next();
                System.out.println("Food Name: " + foodData.getName());
                System.out.println("kJ: " + foodData.getkJ() + " kJ");
                System.out.println("kcal: " + foodData.getKcal() + " kcal");
                System.out.println("Protein: " + foodData.getProtein() + " g");
                System.out.println("Carbohydrate: " + foodData.getCarbohydrate() + " g");
                System.out.println("Sugar: " + foodData.getSugar() + " g");
                System.out.println("Salt: " + foodData.getSalt() + " mg");
                System.out.println("Fat: " + foodData.getFat() + " g");
                System.out.println("Saturated Fat: " + foodData.getSaturated() + " g");
                System.out.println("--------------------------------------");
            }


        }
        return null;
    }
   /* public class printListOut{
        String[] nextReading;
            nextReading = csvReader.readNext();
            if (nextReading[99].equals("")){
                nextReading[99] = "0";
            }
        while ((nextReading = csvReader.readNext()) != null) {

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
*/
}

