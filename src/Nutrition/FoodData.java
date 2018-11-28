package Nutrition;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class FoodData {
    @CsvBindByPosition(position = 0)
    private String name;

    @CsvBindByPosition(position = 4)
    private String kJ;

    @CsvBindByPosition(position = 5)
    private String kcal;

    @CsvBindByPosition(position = 8)
    private String Protein;

    @CsvBindByPosition(position = 10)
    private String Carbohydrate;

    @CsvBindByPosition(position = 99)
    private String Sugar;

    @CsvBindByPosition(position = 49)
    private String Salt;

    @CsvBindByPosition(position = 15)
    private String Fat;

    @CsvBindByPosition(position = 159)
    private String Saturated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getkJ() {
        return kJ;
    }

    public void setkJ(String kJ) {
        this.kJ = kJ;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String getProtein() {
        return Protein;
    }

    public void setProtein(String protein) {
        Protein = protein;
    }

    public String getCarbohydrate() {
        return Carbohydrate;
    }

    public void setCarbohydrate(String carbohydrate) {
        Carbohydrate = carbohydrate;
    }

    public String getSugar() {
        return Sugar;
    }

    public void setSugar(String sugar) {
        Sugar = sugar;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }

    public String getFat() {
        return Fat;
    }

    public void setFat(String fat) {
        Fat = fat;
    }

    public String getSaturated() {
        return Saturated;
    }

    public void setSaturated(String saturated) {
        Saturated = saturated;
    }
}
