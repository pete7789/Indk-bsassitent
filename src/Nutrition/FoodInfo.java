package Nutrition;

/* This class is made as a structure for
   all the food information loaded from DTU*/

public class FoodInfo {
    private String FoodName;
    private int KJ;
    private int Kcal;
    private double Protein;
    private double Carbohydrate;
    private double Sugar;
    private double Salt;
    private double Fat;
    private double SaturatedFat;


    public FoodInfo(String foodName, String kj, String kcal, String protein,
                    String carbohydrate, String sugar, String salt, String fat, String saturatedFat) {

        FoodName = foodName;
        KJ = Integer.parseInt(kj);
        Kcal = Integer.parseInt(kcal);
        Protein = Double.parseDouble(protein);
        Carbohydrate = Double.parseDouble(carbohydrate);
        Sugar = Double.parseDouble(sugar);
        Salt = Double.parseDouble(salt);
        Fat = Double.parseDouble(fat);
        SaturatedFat = Double.parseDouble(saturatedFat);
    }

    public String getFoodName() {
        return FoodName;
    }

    public int getKJ() {
        return KJ;
    }

    public int getKcal() {
        return Kcal;
    }

    public double getProtein() {
        return Protein;
    }

    public double getCarbohydrate() {
        return Carbohydrate;
    }

    public double getSugar() {
        return Sugar;
    }

    public double getSalt() {
        return Salt;
    }

    public double getFat() {
        return Fat;
    }

    public double getSaturatedFat() {
        return SaturatedFat;
    }
}
