public class GravityCalculator {
     public static void main(String[] arguments) {
         // formula = x(t) = 0.5 * at^2 + vt + xi

        double Acceleration = -9.81; // Which is in m/s^2
        double Time  = 0.5;
        double finalTime = 100;
        double initialVelocity = 0; //  Which is for vi
        double initialPosition = 0; // Which is for xi
        System.out.print(Acceleration * Time * finalTime +initialPosition + initialVelocity + "m");
        // Final Answer = -450.5m

    /*
    double gravity = -9.81; // Earth's gravity in m/s^2
    double initialVelocity = 0.0;
    double fallingTime = 10.0;
    double initialPosition = 0.0;
    double finalPosition = 0.0;
     System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    // Answer: The object's position after 10.0 seconds is 0.0 m

     */

    }
}
