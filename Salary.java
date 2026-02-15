package javaprograms;

import java.util.Scanner;
public class Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int salary = a+b+c-d-e;
        System.out.print("Salary: "+salary);
    }
}

