import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the grid dimensions
        int maxX = scanner.nextInt();
        int maxY = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Step 2: Process each robot
        while (scanner.hasNextLine()) {
            // Read the initial position and direction
            String[] positionInput = scanner.nextLine().split(" ");
            int x = Integer.parseInt(positionInput[0]);
            int y = Integer.parseInt(positionInput[1]);
            char direction = positionInput[2].charAt(0);

            // Read the instructions
            String instructions = scanner.nextLine();

            // Step 3: Execute each instruction
            for (char instruction : instructions.toCharArray()) {
                if (instruction == 'L') {
                    direction = turnLeft(direction);
                } else if (instruction == 'R') {
                    direction = turnRight(direction);
                } else if (instruction == 'M') {
                    int[] newPosition = moveForward(x, y, direction, maxX, maxY);
                    x = newPosition[0];
                    y = newPosition[1];
                }
            }

            // Step 4: Output the final position and direction
            System.out.println(x + " " + y + " " + direction);
        }

        scanner.close();
    }

    // Turn left (90 degrees)
    private static char turnLeft(char direction) {
        switch (direction) {
            case 'N': return 'W';
            case 'W': return 'S';
            case 'S': return 'E';
            case 'E': return 'N';
            default: return direction;
        }
    }

    // Turn right (90 degrees)
    private static char turnRight(char direction) {
        switch (direction) {
            case 'N': return 'E';
            case 'E': return 'S';
            case 'S': return 'W';
            case 'W': return 'N';
            default: return direction;
        }
    }

    // Move forward in the current direction
    private static int[] moveForward(int x, int y, char direction, int maxX, int maxY) {
        switch (direction) {
            case 'N': if (y < maxY) y++; break; // Move North (increase y)
            case 'E': if (x < maxX) x++; break; // Move East (increase x)
            case 'S': if (y > 0) y--; break;    // Move South (decrease y)
            case 'W': if (x > 0) x--; break;    // Move West (decrease x)
        }
        return new int[]{x, y};
    }
}