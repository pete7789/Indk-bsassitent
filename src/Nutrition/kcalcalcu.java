package Nutrition;

public class kcalcalcu {
    private double Height;
    private double Weight;
    private double BMI;
    private double kcalcal;
    private double kcalToKj;

    public kcalcalcu(double height, double weight) { // height in cm and weight in kg
        Height = height / 100;
        Weight = weight;
        this.BMI = Weight/(Height*Height);
        if (BMI < 30){
            kcalcal = Weight * 25;
        }
        else {
            kcalcal = Weight * 30;
        }
        kcalToKj = kcalcal * 4.184;
    }

    public double getHeight() {
        return Height;
    }

    public double getWeight() {
        return Weight;
    }

    public double getBMI() {
        return BMI;
    }

    public double getKcalcal() {
        return kcalcal;
    }

    public double getKcalToKj(){return kcalToKj;}
}
