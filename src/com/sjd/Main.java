package com.sjd;

import com.sjd.homework.CountMapGeneric;
import com.sjd.homework.Person;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CountMapGeneric<Integer> mapGeneric = new CountMapGeneric<>();
        mapGeneric.add(10);
        mapGeneric.add(10);
        mapGeneric.add(5);
        mapGeneric.add(6);
        mapGeneric.add(5);
        mapGeneric.add(10);

        System.out.println("size = " + mapGeneric.size());

        System.out.println("count of 5 = " + mapGeneric.getCount(5));
        System.out.println("count of 6 = " + mapGeneric.getCount(6));
        System.out.println("count of 10 = " + mapGeneric.getCount(10));

        System.out.println("count of 10 before removing = " + mapGeneric.remove(10));

        System.out.println("count of 10 = " + mapGeneric.getCount(10));

        HashMap<Integer, Integer> map = mapGeneric.toMap();
        System.out.println("toMap() test " + map);

        CountMapGeneric<Integer> mapGenericAnother = new CountMapGeneric<>();
        mapGenericAnother.add(10);
        mapGenericAnother.add(2);
        mapGenericAnother.add(3);
        mapGenericAnother.add(4);
        mapGenericAnother.add(5);

        mapGeneric.addAll(mapGenericAnother);

        System.out.println("after addAll() size = " + mapGeneric.size());
        System.out.println("toMap() after addAll() " + mapGeneric.toMap());
    }

    public void PersonTest(){
        Person sarah = new Person(true, "Sarah");
        Person kira = new Person(true, "Kira");
        Person john = new Person(false, "John");
        Person mike = new Person(false, "Mike");

        sarah.marry(john);
        kira.marry(mike);
        kira.divorce();
        mike.divorce();
        sarah.marry(mike);
        sarah.marry(mike);
        sarah.marry(kira);
    }
}
