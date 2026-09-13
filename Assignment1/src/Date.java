public class Date {

    private int day;
    private int month;
    private int year;

    private boolean isLeapYear(int y) {

        if (y % 400 == 0) {
            return true;
        }

        if (y % 100 == 0) {
            return false;
        }

        if (y % 4 == 0) {
            return true;
        }

        return false;
    }

    private int getDaysInMonth(int m, int y) {

        if (m == 2) {

            if (isLeapYear(y)) {
                return 29;
            } else {
                return 28;
            }
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }

    public void setDate(int dd, int mm, int yy) {

        day = dd;
        month = mm;
        year = yy;

        while (month > 12) {

            month = month - 12;
            year = year + 1;
        }

        while (month < 1) {

            month = month + 12;
            year = year - 1;
        }

        while (day > getDaysInMonth(month, year)) {

            day = day - getDaysInMonth(month, year);

            month = month + 1;

            if (month > 12) {

                month = 1;
                year = year + 1;
            }
        }

        if (day < 1) {
            day = 1;
        }
    }

    public void addDays(int days) {

        while (days > 0) {

            day = day + 1;
            days = days - 1;

            if (day > getDaysInMonth(month, year)) {

                day = 1;
                month = month + 1;

                if (month > 12) {

                    month = 1;
                    year = year + 1;
                }
            }
        }
    }

    public void addMonths(int months) {

        while (months > 0) {

            month = month + 1;
            months = months - 1;

            if (month > 12) {

                month = 1;
                year = year + 1;
            }
        }

        if (day > getDaysInMonth(month, year)) {

            day = getDaysInMonth(month, year);
        }
    }

    public void addYears(int years) {

        while (years > 0) {

            year = year + 1;
            years = years - 1;
        }

        if (month == 2 && day == 29) {

            if (!isLeapYear(year)) {

                day = 28;
            }
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}