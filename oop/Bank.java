package oop;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static oop.BankAccount.setInterestRate;

public class Bank {
    static Scanner scanner = new Scanner(System.in);
    static Pattern patternCreate = Pattern.compile("create");
    static Matcher matcherCreate;
    static Pattern patternAddDeposit = Pattern.compile("add deposit \\d+ \\d+");
    static Matcher matcherAddDeposit;
    static Pattern patternGetInterest = Pattern.compile("get interest \\d+ \\d+");
    static Matcher matcherGetInterest;
    static Pattern patternSetInterest = Pattern.compile("set interest \\d+");
    static Matcher matcherSetInterest;
    public static BankAccount[] accounts = new BankAccount[100];


    public static void main(String[] args) {
        int id = 0;
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            matcherCreate = patternCreate.matcher(input);
            if (matcherCreate.find()) {
                id++;
                accounts[id] = new BankAccount();
                System.out.printf("Account ID %d created\n", id);
            }
            matcherAddDeposit = patternAddDeposit.matcher(input);
            if (matcherAddDeposit.find()) {
                if (Integer.parseInt(input.split(" ")[2]) > id) {
                    System.out.printf("Account ID %s does not exist\n", input.split(" ")[2]);
                } else {
                    accounts[Integer.parseInt(input.split(" ")[2])].deposit(Double.parseDouble(input.split(" ")[2]));
                    System.out.printf("Deposited %s to ID %s\n", input.split(" ")[3], input.split(" ")[2]);
                }
            }
            matcherSetInterest = patternSetInterest.matcher(input);
            if (matcherSetInterest.find()) {
                BankAccount.setInterestRate(Double.parseDouble(input.split(" ")[2]));
                System.out.println("Change Interest Rate");
                break;
            }
            matcherGetInterest = patternGetInterest.matcher(input);
            if (matcherGetInterest.find()) {
                if (Integer.parseInt(input.split(" ")[2]) > id) {
                    System.out.printf("Account ID %s does not exist\n", input.split(" ")[2]);
                } else {
                    System.out.println(accounts[Integer.parseInt(input.split(" ")[2])].getInterest(Integer.parseInt(input.split(" ")[3])));
                }
            }
            if (input.equals("end")) break;

        }

    }
}