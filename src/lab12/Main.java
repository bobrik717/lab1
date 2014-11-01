package lab12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int x1 = 0;
        if(sc.hasNextInt()){
            x1 = sc.nextInt();
        }
        System.out.println("Введите число 2:");
        int x2 = 0;
        if(sc.hasNextInt()){
            x2 = sc.nextInt();
        }
        double average = (x1 + x2)/(double)2;
        
        System.out.printf("Среднее : %g \n",average);
    }
}
