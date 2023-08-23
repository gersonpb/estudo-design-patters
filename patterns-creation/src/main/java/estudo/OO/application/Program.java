package estudo.OO.application;

import estudo.OO.Company;
import estudo.OO.Individual;
import estudo.OO.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of taxpayers: ");
        int N = sc.nextInt();
        List<TaxPayer> list = new ArrayList<TaxPayer>();

        for (int i = 0; i < N; i++) {
            System.out.println("Taxpayer #" + i +" data: ");
            System.out.println("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (type == 'i'){
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer tp: list) {
            System.out.println(tp.getName() +": $ "+ String.format("%.2f", tp.tax()));
        }
        System.out.println();
        double total= 0.0;
        for (TaxPayer tp: list) {
            total += tp.tax();
        }

        System.out.println("TOTAL TAXES: " + String.format("%.2f", total));


//        Enter the number of tax payers: 3
//        Tax payer #1 data:
//        Individual or company (i/c)? i
//        Name: Alex
//        Anual income: 50000.00
//        Health expenditures: 2000.00
//        Tax payer #2 data:
//        Individual or company (i/c)? c
//        Name: SoftTech
//        Anual income: 400000.00
//        Number of employees: 25
//        Tax payer #3 data:
//        Individual or company (i/c)? i
//        Name: Bob
//        Anual income: 120000.00
//        Health expenditures: 1000.00
//
//        TAXES PAID:
//        Alex: $ 11500.00
//        SoftTech: $ 56000.00
//        Bob: $ 29500.00
//
//        TOTAL TAXES: $ 97000.00
//
//        sc.close();
    }
}
