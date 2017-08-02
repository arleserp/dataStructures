/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundations.java;

/**
 *
 * @author Arles
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 1980;
    }

    public Date(int theDay, int theMonth, int theYear) {
        day = theDay;
        month = theMonth;
        year = theYear;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(3, 8, 2017);
        System.out.println("Date 1:" + date1);
        System.out.println("Date 2:" + date2);
    }
}
