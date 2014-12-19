package string;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.nextLine();
        
        System.out.printf("Привет, %s!!! \n",name);
    }
}
