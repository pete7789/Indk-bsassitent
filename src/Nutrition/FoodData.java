package Nutrition;

import com.opencsv.bean.CsvBindByName;

public class FoodData {
    @CsvBindByName
    private String EnglishName;

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

    public String getEnglishName() { return EnglishName; }

    public String getkJ() {
        return kJ;
    }

    public String getKcal() {
        return kcal;
    }

    public String getProtein() {
        return Protein;
    }

    public String getCarbohydrate() {
        return Carbohydrate;
    }

    public String getSugar() {
        return Sugar;
    }

    public String getSalt() {
        return Salt;
    }

    public String getFat() {
        return Fat;
    }

    public String getSaturated() {
        return Saturated;
    }

    public void setEnglishName(String englishName) { EnglishName = englishName; }

    public void setkJ(String kJ) {
        this.kJ = kJ;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public void setProtein(String protein) {
        Protein = protein;
    }

    public void setCarbohydrate(String carbohydrate) {
        Carbohydrate = carbohydrate;
    }

    public void setSugar(String sugar) {
        Sugar = sugar;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }

    public void setFat(String fat) {
        Fat = fat;
    }

    public void setSaturated(String saturated) {
        Saturated = saturated;
    }
}
