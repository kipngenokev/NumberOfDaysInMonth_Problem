public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1,-2018));

    }
    public static boolean isLeapYear(int year) {
        return (year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int  getDaysInMonth(int month,int year) {
        if(year<1|| year>9999){
            return -1;
        } else {
            switch (month){
                case 1,3,5,7,8,10,12:
                    return 31;
                case 2:
                    if(isLeapYear(year)==true) {
                        return 29;
                    }
                        return 28;


                case 4,6,9,11:
                    return 30;
                default:
                    return -1;

            }

        }
    }
}