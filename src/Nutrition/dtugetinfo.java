package Nutrition;



public class dtugetinfo{

    public static void main(String[] args){
/*
        var info = new GetInfo();

        for (FoodInfo current : info.getInfoList()){
            System.out.println(current.getFoodName() + " " + current.getKJ());
        }

        var calinfo = new kcalcalcu(185, 80);

        System.out.println(calinfo.getBMI() + " " + calinfo.getKcalcal());
*/
        var eat = new EatenFood();

        eat.foodAdd(100, "Bread");

        System.out.println(eat.FoodEaten.get(0).getFoodName());

    }

}