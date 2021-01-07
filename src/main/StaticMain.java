package main;

import Static.StaticClass;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println("Static Variable rollNo = " + StaticClass.rollNo);
        System.out.println("Static Variable Name = " + StaticClass.name);
        System.out.println("Static Variable Marks = " + StaticClass.marks);

     /*
        We can use this method but it isn't recommended
        StaticClass obj = new StaticClass();
        //accessing static variable by object
        System.out.println(obj.rollNo);
      */

        
    }

}
