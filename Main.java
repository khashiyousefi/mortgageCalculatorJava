package com.SixLink;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int age = 30;
        int [] numbers = {2,3,4,6,1};
        int [] oldWayNumbers = new int[5];

        Arrays.sort(numbers);

        Date now = new Date();
        Point cords = new Point(1,1);
        Point cordCopy = cords;
        cords.x = 2;
        System.out.println(now);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Hello World " + age);
        System.out.println(cordCopy);
    }



}
