package ru.netology.stats;

public class StatsService {
    public int saleAmount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int saleAverage(int[] sales) {
        return saleAmount(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverage(int[] sales) {
        int below = 0;
        int average = saleAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                below++;
            }
        }

        return below;
    }

    public int higherAverage(int[] sales) {
        int higher = 0;
        int average = saleAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                higher++;
            }
        }

        return higher;
    }
}
