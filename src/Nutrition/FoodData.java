package Nutrition;

import com.opencsv.bean.CsvBindByName;

public class FoodData {
    @CsvBindByName
    private String Englishname;

    @CsvBindByName
    private String kJ;

    @CsvBindByName
    private String kcal;

    @CsvBindByName
    private String Protein;

    @CsvBindByName
    private String Carbohydrate;

    @CsvBindByName
    private String Sugar;

    @CsvBindByName
    private String Salt;

    @CsvBindByName
    private String Fat;

    @CsvBindByName
    private String Saturated;

    public String getEnglishname() {
        return Englishname;
    }

    public void setEnglishname(String englishname) {
        Englishname = englishname;
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
