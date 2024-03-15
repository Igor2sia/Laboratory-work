package oop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static oop.BankAccount.setInteresetRate;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    static Pattern patternAddDeposit = Pattern.compile("add deposit \\d+ \\d+");
    static Matcher matcherAddDeposit;
    static Pattern patternGetInterest = Pattern.compile("get interest \\d+ \\d+");
    static Matcher matcherGetInterest;
    public static BankAccount[] accounts = new BankAccount[100];

    public static void main(String[] args) {
        String input = scanner.nextLine();
        matcherAddDeposit = patternAddDeposit.matcher(input);
        while (matcherAddDeposit.find()) {
            int id = Integer.parseInt(input.split("")[2]);
            int amount = Integer.parseInt((input.split("")[3]));
        }
        matcherGetInterest = patternGetInterest.matcher(input);
    }
}