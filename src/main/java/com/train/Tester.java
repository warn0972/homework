package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int number = scanner.nextInt();
        System.out.println("是否需要購買來回車票張數: ");
        int roundtrip = scanner.nextInt();
        Ticket ticket = new Ticket(number, roundtrip);
        ticket.print();
    }
}
