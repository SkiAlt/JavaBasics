/*
Aim: Introduce the concept of Abstraction, packages.
Program: Develop a java application to implement currency converter (Dollar to INR, EURO to
INR, Yen to INR and vice versa), distance converter (meter to KM, miles to KM and vice versa),
time converter (hours to minutes, seconds and vice versa) using packages
*/
import CurrencyConverter.*;
import DistanceConverter.*;
import TimeConverter.*;
import java.io.*;
import java.util.*;

class Converter {
        public static void main(String args[]) {
                for (;;) {
                        System.out.println("1.CurrencyConverter");
                        System.out.println("2.DistanceConverter");
                        System.out.println("3.TimeConverter");
                        Converter cr = new Converter();
                        Scanner c = new Scanner(System.in);
                        int choice = c.nextInt();
                        String op = null;
                        switch (choice) {
                                case 1:
                                        cr.Currency();
                                        break;
                                case 2:
                                        cr.Distance();
                                        break;
                                case 3:
                                        cr.Time();
                                        break;
                                default:
                                        System.out.println("Invalid case");
                                        return;
                        }
                }
        }

        public void Currency() {
                Scanner in = new Scanner(System.in);
                System.out.println("Welcome to Currency Converter");
                System.out.println("Enter the amount :");
                double amt = in.nextInt();
                CurrencyConverter cc = new CurrencyConverter();
                System.out.println("DOLLOR=" + amt + " is INR=" + cc.dollortoinr(amt));
                System.out.println("INR=" + amt + " isDOLLOR=" + cc.inrtodollor(amt));
                System.out.println("EURO=" + amt + " is INR=" + cc.eurotoinr(amt));
                System.out.println("INR=" + amt + " is EURO=" + cc.inrtoeuro(amt));
                System.out.println("YEN=" + amt + " is INR=" + cc.yentoinr(amt));
                System.out.println("INR=" + amt + " is YEN=" + cc.inrtoyen(amt));
        }

        public void Distance() {
                Scanner in = new Scanner(System.in);
                System.out.println("Welcome to Distance Converter");
                System.out.println("Enter the distance :");
                double dis = in.nextInt();
                DistanceConverter dd = new DistanceConverter();
                System.out.println("METER=" + dis + " is KM=" + dd.metertokm(dis));
                System.out.println("KM=" + dis + " is METER=" + dd.kmtometer(dis));
                System.out.println("MILES=" + dis + " is KM=" + dd.milestokm(dis));
                System.out.println("KM=" + dis + "is MILES=" + dd.kmtomiles(dis));
        }

        public void Time() {
                Scanner out = new Scanner(System.in);
                System.out.println("Welcome to Time Converter");
                System.out.println("Enter the time :");
                double tim = out.nextInt();
                TimeConverter tt = new TimeConverter();
                System.out.println("HOURS=" + tim + " is MINUTES=" + tt.hourstominutes(tim));
                System.out.println("MINUTES=" + tim + " is HOURS=" + tt.minutestohours(tim));
                System.out.println("HOURS=" + tim + " isSECONDS=" + tt.hourstoseconds(tim));
                System.out.println("SECONDS=" + tim + " is HOURS=" + tt.secondstohours(tim));
        }
}
