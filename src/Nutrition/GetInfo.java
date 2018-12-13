package Nutrition;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class GetInfo {

    private static final String DTU_GET_INFO = "src/Nutrition/Fodevaredata_prog_v3_new6.csv";
    public List<FoodInfo> InfoList = new ArrayList<>();

    public GetInfo() {

        try (
                Reader reader = Files.newBufferedReader(Paths.get(DTU_GET_INFO));
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(3).build()

        ) {
            String[] nextReading;
            while ((nextReading = csvReader.readNext()) != null) {


                if (nextReading[0].equals("")) {
                    nextReading[0] = " ";
                }

                int[] check = new int[] {4, 5, 8, 10, 99, 49, 15, 159};

                for (int current : check) {
                    if (nextReading[current].equals("")) {
                        nextReading[current] = "0";
                    }
                }
                FoodInfo current = new FoodInfo(nextReading[0],nextReading[4],nextReading[5],
                                                nextReading[8],nextReading[10],nextReading[99],
                                                nextReading[49],nextReading[15],nextReading[159]);

                InfoList.add(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<FoodInfo> getInfoList() {
        return InfoList;
    }
}
