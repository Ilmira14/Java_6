package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService sum = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = sum.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService avg = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = avg.calculateAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthOfMax() {
        StatsService max = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = max.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthOfMin() {
        StatsService min = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = min.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthUnderAvg() {
        StatsService underAvg = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = underAvg.calculateMonthUnderAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthOverAvg() {
        StatsService overAvg = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = overAvg.calculateMonthOverAvg(sales);

        assertEquals(expected, actual);
    }
}