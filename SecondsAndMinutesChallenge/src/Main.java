public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Input seconds should be positive";
        }
        int minutes = seconds / 60;
        int secLeft = seconds % 60;

        String result = getDurationString(minutes, secLeft);
        return result;
    }

    public static String getDurationString(int minutes, int seconds) {
        if ( (minutes < 0) || ((seconds < 0) || (seconds >59)) ) {
            return "Input values should be positive, seconds should be a positive value and it should be less than 59";
        }

        int hours = minutes / 60;
        int minLeft = minutes % 60;

        String resultStr = hours + "h " + minLeft + "m " + seconds + "s";

        return resultStr;
    }
}

