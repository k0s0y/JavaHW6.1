package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] managerSales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(managerSales);

        assertEquals(expected,actual);
    }
    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] managerSales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(managerSales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMaxMonth() {
        StatsService service = new StatsService();
        long[] managerSales  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.maxSales(managerSales);


        assertEquals(expected, actual);
    }
    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.minSales(managerSales);


        assertEquals(expected, actual);
    }
    @Test
    void shouldUnderAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.underAvg(managerSales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldOverAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.overAvg(managerSales);

        assertEquals(expected, actual);
    }
}