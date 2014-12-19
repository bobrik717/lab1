package farengate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колтчество гардусов по фаренгейту");
        int temp = 0;
        if(sc.hasNextInt()){
            temp = sc.nextInt();
        }
        double cels = (temp - 32) * (5 / (double)9);
        System.out.printf("Температура по цельсию: %g \n", cels);
    }
}
