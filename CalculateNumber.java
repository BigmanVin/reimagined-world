public class CalculateNumber {

    public static void main(String[] args) {

//        float calculatedCentimiters = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(75);


        double centAnswer = calcFeetAndInchesToCentimeters(2, 1);
        System.out.println("Answer = " + centAnswer);

        calcFeetAndInchesToCentimeters(5, 12);

        calcFeetAndInchesToCentimeters(10);



    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid input");
            return -1; }

            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;

        }



    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid input");
            return -1;
        }
            double feet = (int) inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches equals to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        }

    }





