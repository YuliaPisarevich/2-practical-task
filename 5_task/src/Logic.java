public class Logic {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int dayInCurrentMonth(int month, int year) {
        int days=0;
        switch (month) {
            case 1: days = 31; break;
            case 2:
                if (isLeapYear(year)){
                    days = 29;
                }else{
                    days = 28;
                }break;
            case 3:  days = 31; break;
            case 4:  days = 30; break;
            case 5:  days = 31; break;
            case 6:  days = 30; break;
            case 7:  days = 31; break;
            case 8:  days = 31; break;
            case 9:  days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
            default: {
                System.out.println("Введена некорректная дата");
                break;
            }
        }
        return days;
    }
    public static String getNextDay(int day, int month, int year) {

        String strDate = "";
        if (isCorrectInput(day, month, year)) {
            if (day == 31 && month == 12) {
                year = year + 1;
                month = 1;
                day = 1;
            } else {
                if (day == dayInCurrentMonth(month, year)) {
                    month = month + 1;
                    day = 1;
                } else if (day < dayInCurrentMonth(month, year) && day > 0) {
                    day = day + 1;
                }
            }
            strDate = String.valueOf(day) + "." + String.valueOf(month) + "." + String.valueOf(year);
        } else {
            strDate = "невозможно расчитать";
        }
        return strDate;
    }

    public static boolean isCorrectInput(int day, int month, int year) {
        int maxDays = dayInCurrentMonth(month, year);
        if (day > 0 && day <= maxDays && month > 0 && month <= 12) {
            return true;
        } else {
            return false;
        }
    }
}
