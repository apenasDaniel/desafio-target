import java.util.Arrays;
import java.util.List;

public class MonthlyTurnover {

    public static void main(String[] args) {

        List<Double> dailyTurnover = Arrays.asList(
                22174.1664, 24537.6698, 26139.6134, 0.0, 0.0,
                26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722,
                0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448,
                18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852,
                4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221,
                13220.495, 8414.61
        );


        double smallest = Double.MAX_VALUE;
        double biggest = Double.MIN_VALUE;
        for (Double value : dailyTurnover) {
            if (value < smallest && value != 0) {
                smallest = value;
            }
            if (value > biggest) {
                biggest = value;
            }
        }


        double sum = 0;
        int daysWithTurnover = 0;
        for (Double value : dailyTurnover) {
            if (value != 0) {
                sum += value;
                daysWithTurnover++;
            }
        }
        double average = sum / daysWithTurnover;


        int daysAboveAverage = 0;
        for (Double value : dailyTurnover) {
            if (value > average) {
                daysAboveAverage++;
            }
        }


        System.out.println("Smallest daily turnover value: R$" + smallest);
        System.out.println("Biggest daily turnover value: R$" + biggest);
        System.out.println("Number of days with turnover above the monthly average: " + daysAboveAverage);
    }

}
