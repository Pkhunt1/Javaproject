package com.company.string;

public class ReverseString {

    public static void main(String[] args) {
        String myName = "naresh";

        StringBuffer ob = new StringBuffer(myName);
        System.out.println(ob.reverse());
    }
}
