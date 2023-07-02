package ru.netology.stats;

public class StatsService {
    public int getMaxMonth(int[] max) {
        int maxMonth = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] >= max[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] min) {
        int maxMonth = 0;
        for (int i = 0; i < min.length; i++) {
            if (min[i] < min[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int getAvgMonth(int[] avg) {
        int avgMonth = 0;
        for (int i = 0; i < avg.length; i++) {
            if (avg[i] < 180) {
                avgMonth += avg[i];
            }
        }
        return (avgMonth / avg.length);
    }

    public int getSumMonth(int[] sum) {
        int sumMonth = 0;
        for (int i = 0; i < sum.length; i++) {
            sumMonth = sum[i] + sumMonth;
        }
        return sumMonth;
    }

    public int getLowAvgMonth(int[] low) {
        int countMonths = 0;
        int average = getAvgMonth(low);
        for (int i = 0; i < low.length; i++) {
            if (low[i] < average) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int getHighAvgMonth(int[] high) {
        int countHMonths = 0;
        int average = getAvgMonth(high);
        for (int i = 0; i < high.length; i++) {
            if (high[i] > average) {
                countHMonths++;
            }
        }
        return countHMonths;
    }
}


