package Bai_Tap.ss9_automated_testing.tinh_ngay_tiep_theo.tinh_ngay_tiep_theo;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        if (day <= 0 || month <= 0 || month > 12) {
            throw new IllegalArgumentException("Ngày hoặc tháng không hợp lệ!");
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        if (day > daysInMonth[month - 1]) {
            throw new IllegalArgumentException("Ngày không hợp lệ!");
        }

        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
        }
        if (month > 12) {
            month = 1;
            year++;
        }

        return day + "/" + month + "/" + year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
