public class GradeCalculator {

        public static void main(String[] args) {

            int score1 = 20;
            int score2 = 50;
            int score3 = 32;

            double average = (score1 + score2 + score3) / 3.0;

            System.out.println("Average score: " + average);

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 80) {
                System.out.println("Grade: B");
            } else if (average >= 70) {
                System.out.println("Grade: C");
            } else if (average >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }



}

