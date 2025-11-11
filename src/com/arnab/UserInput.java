package com.arnab;

import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // getting user input
    //        System.out.println("Hello, what is your name: ");
    //        String userName = scanner.nextLine();
    //
    //        System.out.println("hello "+ userName);
    //        scanner.close();

        // error handling and exceptions
//
//        try{
//        System.out.println(Integer.parseInt("1"));
//            for(int i = 10; i >= 0; i--){
//                if(i == 0){
//                    throw new ArithmeticException("Can't divide by zero");
//                }
//            System.out.println(10/2);
//        }
//        }catch (NumberFormatException | ArithmeticException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }catch (Exception e){ // <-- catching all unknown error exceptions
//
//        }

        try {
            System.out.println(divide(10,0));
        } catch (MyCheckedExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    public static double divide(double a, double b) throws MyCheckedExceptions{
        if(b==0){
            throw  new MyCheckedExceptions("Cannot divide by ZERO sir");
        }
        return a /b;
    }
}
