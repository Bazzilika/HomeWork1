package com.sjd;

import com.sjd.homework.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
