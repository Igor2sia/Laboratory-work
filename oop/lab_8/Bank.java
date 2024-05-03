package oop.lab_8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("end")) {
            matcherCreate = patternCreate.matcher(input);
            while (matcherCreate.find()) {
                id++;
                accounts[id] = new BankAccount();
                System.out.printf("Account ID %d created\n", id);
                input = scanner.nextLine().toLowerCase();
            }
            matcherAddDeposit = patternAddDeposit.matcher(input);
            while (matcherAddDeposit.find()) {
                if (Integer.parseInt(input.split(" ")[2]) > id) {
                    System.out.printf("Account ID %s does not exist\n", input.split(" ")[2]);
                } else {
                    accounts[Integer.parseInt(input.split(" ")[2])].deposit(Double.parseDouble(input.split(" ")[2]));
                    System.out.printf("Deposited %s to ID %s\n", input.split(" ")[2], input.split(" ")[3]);
                }
                input = scanner.nextLine().toLowerCase();
            }
            matcherSetInterest = patternSetInterest.matcher(input);
            while (matcherSetInterest.find()) {
                BankAccount.setInterestRate(Double.parseDouble(input.split(" ")[2]));
                System.out.println("Change Interest Rate");
                input = scanner.nextLine().toLowerCase();
            }
            matcherGetInterest = patternGetInterest.matcher(input);
            while (matcherGetInterest.find()) {
                if (Integer.parseInt(input.split(" ")[2]) > id) {
                    System.out.printf("Account ID %s does not exist\n", input.split(" ")[2]);
                    input = scanner.nextLine().toLowerCase();
                } else {
                    System.out.println(accounts[Integer.parseInt(input.split(" ")[2])].getInterest(Integer.parseInt(input.split(" ")[3])));
                    input = scanner.nextLine().toLowerCase();
                }
            }
        }
    }
}