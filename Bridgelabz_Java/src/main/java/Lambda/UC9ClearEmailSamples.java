package main.java.Lambda;
/*
As a User need to add sample emails and test with clear method
Author : Ashish Srivastava
Date: 19/10/2026*/
import java.util.ArrayList;
import java.util.List;

public class UC9ClearEmailSamples {
    public static void main(String[] args) {
        List<String> emailSamples = new ArrayList<>();

        emailSamples.add("abc.xyz@bl.co.in");
        emailSamples.add("john@gmail.com");
        emailSamples.add("test@yahoo.com");

        emailSamples.clear();

        System.out.println("Email samples: " + emailSamples);
    }
}