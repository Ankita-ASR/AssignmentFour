import java.util.Scanner;
public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle (in degrees)[0,360]: ");
        int angle = scanner.nextInt();

        String direction = getCompassDirection(angle);
        System.out.println("Nearest compass direction: " + direction);
    }

    public static String getCompassDirection(int angle) {
        if (angle == 0) {
            return "N";
        } else if (angle >= 0 && angle < 90) {
            return "NE";
        } else if (angle ==90) {
            return "E";
        } else if (angle > 90 && angle < 180) {
            return "SE";
        } else if (angle == 180 ) {
            return "S";
        } else if (angle >= 180 && angle < 270) {
            return "SW";
        } else if (angle ==270) {
            return "W";
        }
        else
        return "NW";
    }
}
