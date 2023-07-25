package homework.three;

public class QuestionNine {
    private QuestionNine() {

    }

    public static void answer() {
        System.out.println("# Print headings for four weeks (Weeks 1 - 4) And (Days 1 -7) for each week #");
        int week = 4;
        int day = 7;
        for (int weekIndex = 1; weekIndex <= week; weekIndex++) {
            System.out.println(" Week " + weekIndex);
            for (int deyIndex = 1; deyIndex <= day; deyIndex++) {
                System.out.println(" Day " + deyIndex);
            }
        }
    }
}
