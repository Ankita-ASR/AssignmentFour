import java.util.Scanner;
public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle (in degrees): ");
        int angle = scanner.nextInt();

        String direction = getCompassDirection(angle);
        System.out.println("Nearest compass direction: " + direction);
    }
    public static String getCompassDirection(int angle) {
        if (angle >= 338 || angle < 23) {
            return "N";
        } else if (angle >= 23 && angle < 68) {
            return "NE";
        } else if (angle >= 68 && angle < 113) {
            return "E";
        } else if (angle >= 113 && angle < 158) {
            return "SE";
        } else if (angle >= 158 && angle < 203) {
            return "S";
        } else if (angle >= 203 && angle < 248) {
            return "SW";
        } else if (angle >= 248 && angle < 293) {
            return "W";
        } else {
            return "NW";
        }
    }
}


