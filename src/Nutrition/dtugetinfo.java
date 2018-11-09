package Nutrition;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dtugetinfo{


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\murat\\OneDrive\\Dokumenter\\Indk-bsassitent\\src\\Nutrition\\test1.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next() + "|");
        }
        scanner.close();
    }

}
