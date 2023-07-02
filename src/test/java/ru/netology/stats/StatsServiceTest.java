package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        int[] max = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMaxMonth(max);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        int[] min = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(min);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindAvgMonthSales() {
        StatsService service = new StatsService();

        int[] avg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 15;
        int actualMonth = service.getAvgMonth(avg);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSumMonthSales() {
        StatsService service = new StatsService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 180;
        int actualMonth = service.getSumMonth(sum);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindLowMonthSales() {
        StatsService service = new StatsService();

        int[] low = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.getLowAvgMonth(low);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindHighMonthSales() {
        StatsService service = new StatsService();

        int[] high = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.getHighAvgMonth(high);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}