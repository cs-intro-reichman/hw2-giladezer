public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        time = time.replaceAll("\\s+", "");
        int minutesToAdd = Integer.parseInt(args[1]);
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        hours += (minutes + minutesToAdd) / 60;
        hours = hours % 24;
        minutes = (minutes + minutesToAdd) % 60;
        System.out.println(hours + ":" + minutes);
    }
}
