package com.arnab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(); // this list can hold non-floating-point numbers
        List<String> names = new ArrayList<>(); // // this list can hold only strings

//        numbers.add(10.4);  <-- we can't store a value like this in our numbers list<Integer>
        numbers.add(10);

        Comparable<Integer> number = 10;
        number.compareTo(11); // <- 0 false
//        number.compareTo("10")  <-- this is also is wrong, we can't compare two different datatype variables or values
        Point<Integer, Integer> point = new Point<>();
        point.setX(10);
        point.setY(20);

//        IN Generics you have to use object versions not int, char so on
        Integer[] numbers3 =  {1,2,3,4,5,6};
        String[] animals =  {"lion","bird"};

        Character[] chars = {'A','H','M','E','D'};
        List<Character> chars2 = Arrays.asList('A','B');
        chars2.add('A');
        print(numbers3);
        print(chars);

        printList(numbers);
//        printList(chars2);
    }

// generics and methods
    static <T extends Comparable<T>>void print(T[] array){
        for(T e: array){
            System.out.println(e.getClass().getName() + "-" + e);
        }
    }

    static void printList(List<? extends Number> list){ // ANY TYPE if i add extends with sometype only that type will accept
        list.forEach(System.out::println);
    }
}

class Point<k,v> {
    private k y;
    private v x;

    public void setX(v x) {
        this.x = x;
    }

    public void setY(k y) {
        this.y = y;
    }

     public k getPointY(){
        return this.y;
    }
}
