package com.arnab;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Strings {

    public static  void main(String []args){

        // STRINGS
        String name = "Ahmed";
        String school = "Noradin";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isBlank()); // <--
        System.out.println(name.compareTo("a"));

        String[] names = {"Ahmed", "Arnab"};
        String joinedSNames = String.join("-", names).toLowerCase();
        System.out.println(joinedSNames);

//        DATES
        /**
         * LocalDateTime <-- both of them combined
         * LocalDate <-- date related
         * LocalTime <-- time related
         * */

        LocalDate today = LocalDate.now();
        LocalDate nextWeeks = today.plusWeeks(1);
        System.out.println(nextWeeks);

        LocalTime time = LocalTime.now();
        System.out.println(time.getSecond());

//        for(String zone :ZoneId.getAvailableZoneIds()){
//            System.out.println(ZoneId.getAvailableZoneIds().toArray().length);
//           System.out.println(LocalDateTime.now(ZoneId.of(zone)));
//        }

        LocalDate date = LocalDate.of(2023, 10, 5);
        System.out.println(date);

        // BigDecimal
        BigDecimal numberOne = new BigDecimal("0.12");
        BigDecimal numberTwo = new BigDecimal("0.30");

        BigDecimal balance = numberTwo.subtract(numberOne);
        System.out.println(balance);
    }
}
