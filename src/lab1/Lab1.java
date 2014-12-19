package lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3;
        
        //лгическое И
        b3 = b1 && b2;
        System.out.println(b3);
        
        //лгическое ИЛИ
        b3 = b1 || b2;
        System.out.println(b3);
        
        //лгическое НЕ
        b3 = !b1;
        System.out.println(b3);
        
        //лгическое XOR
        b3 = b1 ^ b2;
        System.out.println(b3);
        
        /*int x = 123;
        int x1 = 0x1f;
        float y = 12.3F;
        double z = 1.5;
        //byte b = 100;
        char ch = 'A';
        short g = 32000;
        
        int a = 1,b = 2;
        
        a = (b = 7);
        
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x = (1+2)*3-7/2%2;
        System.out.println(x);
        x += 6;
        System.out.println(x);
        /*System.out.println(x1);
        System.out.println(z);
        System.out.println(y);
        System.out.println(ch);
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1:");
        //String s1 = sc.nextLine();
        int num1 = 0;
        if(sc.hasNextInt()){
            num1 = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Введите число 2:");
        int num = Integer.parseInt(sc.nextLine());
        
        System.out.println(num1);
        System.out.println(num);*/
    }    
}
