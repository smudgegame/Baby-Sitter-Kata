public class TimeParser {

    public int parse(String input) {
        String[] splitUpTime = input.split(":");
        int hour = Integer.parseInt(splitUpTime[0]);
        int suffix=12;
        if(splitUpTime[1].toLowerCase().endsWith("am")){
            suffix = 24;
        }
        return hour + suffix;
    }
}
