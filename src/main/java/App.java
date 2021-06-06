/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final int legal = 16;
    public static void main(String[] args) {
        App app = new App();
        String age = app.readAge();
        app.printOutput(age);
    }

    private void printOutput(String age) {
        int ageInt = Integer.parseInt(age);
        final String msg = ageInt >= legal
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        System.out.println(msg);
    }

    private String readAge() {
        System.out.print("What is your age? ");
        String age = in.nextLine();
        return age;
    }
}