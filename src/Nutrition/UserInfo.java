package Nutrition;


public class UserInfo {

    private String Name;
    private int Age;
    private double Height;
    private double Weight;
    private double Salt;
    private double Protein;
    private double Carbohydrate;
    private double Sugar;
    private double Fat;
    private double SaturatedFat;



    public UserInfo(String name, int age, double height, double weight) {
        Name = name;
        Age = age;
        Height = height;
        Weight = weight;
        Salt = 2300;
        Protein = 51;
        Carbohydrate = 130;
        Sugar = 31.25;
        Fat = 60.5;
        SaturatedFat = 22;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public double getSalt() {
        return Salt;
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

    public double getFat() {
        return Fat;
    }

    public double getSaturatedFat() {
        return SaturatedFat;
    }

    public double getKcal() {
        var user = new kcalcalcu(Height, Weight);
        return user.getKcalcal();
    }

    public double getKJ() {
        var user = new kcalcalcu(Height, Weight);
        return user.getKcalToKj();
    }
}