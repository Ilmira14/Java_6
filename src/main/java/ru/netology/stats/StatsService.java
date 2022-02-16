package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
        }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthUnderAvg(int[] sales) {
        int monthUnderAvg = 0;
        for (int sale : sales) {
            if (calculateAvg(sales) > sale) {
                monthUnderAvg ++;
            }
        }
        return monthUnderAvg;
    }

    public int calculateMonthOverAvg(int[] sales) {
        int monthOverAvg = 0;
        for (int sale : sales) {
            if (sale > calculateAvg(sales)) {
                monthOverAvg ++;
            }
        }
        return monthOverAvg;
    }
}
