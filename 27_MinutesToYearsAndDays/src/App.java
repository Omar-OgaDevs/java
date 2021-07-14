public class App {
    public static void main(String[] args) throws Exception {
        
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        }
    
        public static void printYearsAndDays (long minutes) {
            if (minutes >= 0) {
                long days = (minutes / 60) / 24;
                long remainingDays = days % 365;
                long years = days / 365;
                System.out.println(minutes + " minutes = " + years + " years and " + remainingDays + " days");
            } else {
                System.out.println("Invalid Value");
            }
    }
}
