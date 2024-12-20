
# RC Robots

This Java program simulates the movement of robots on a 2D grid. The robots are controlled using a series of instructions, and the program calculates their final positions and orientations after following those instructions.

## Table of Contents
1. [Description](#description)
2. [Input Format](#input-format)
3. [Output Format](#output-format)
4. [Steps Explained](#steps-explained)
5. [Sample Input & Output](#sample-input-output)
6. [Diagram](#diagram)

---

## Description

The program simulates multiple robots on a 2D grid. The grid has a specified size, and each robot starts at a given position with an initial orientation (North, East, South, or West). The robots follow a series of instructions to move, turn left (`L`), turn right (`R`), or move forward (`M`). After executing all the instructions, the program outputs the final position and orientation of each robot.

---

## Input Format

1. The first line contains two integers `maxX` and `maxY` representing the dimensions of the grid (the grid is `maxX + 1` by `maxY + 1` in size).
2. The subsequent lines consist of pairs of lines:
    - The first line of each pair contains the robot's starting position and orientation in the format: `x y direction`, where:
        - `x` and `y` are the starting coordinates of the robot.
        - `direction` is one of the characters: `N` (North), `E` (East), `S` (South), or `W` (West).
    - The second line contains a string of instructions (`L`, `R`, `M`), where:
        - `L` rotates the robot 90 degrees to the left.
        - `R` rotates the robot 90 degrees to the right.
        - `M` moves the robot one step forward in the current direction.

---

## Output Format

For each robot, after all instructions are executed, the program outputs the robot's final position and direction in the format: `x y direction`.

---

## Steps Explained

### Step 1: Read the Grid Dimensions

The program starts by reading the grid dimensions from the input (`maxX` and `maxY`). These values define the boundaries of the grid.

### Step 2: Process Each Robot

For each robot:
- The starting position and direction are read.
- The instructions for moving the robot are read and processed sequentially.

### Step 3: Execute Instructions

The program processes each instruction:
- **Turn Left (`L`)**: The robot rotates 90 degrees to the left.
- **Turn Right (`R`)**: The robot rotates 90 degrees to the right.
- **Move (`M`)**: The robot moves forward one step in the current direction, checking if the new position is within the grid boundaries.

### Step 4: Output the Final Position

After all instructions have been executed, the program outputs the final position and direction of the robot.

---

## Sample Input & Output

### Sample Input:
```
5 5
1 0 N
MMRMMLMMR
```

### Sample Output:
```
3 4 E
```

### Explanation:

1. The grid is `5x5`, so valid coordinates are from `(0, 0)` to `(5, 5)`.
2. The robot starts at position `(1, 0)` facing North (`N`).
3. The robot follows the instructions:
    - `M` (Move North): Position becomes `(1, 1)`.
    - `M` (Move North): Position becomes `(1, 2)`.
    - `R` (Turn Right): Direction changes to East (`E`).
    - `M` (Move East): Position becomes `(2, 2)`.
    - `M` (Move East): Position becomes `(3, 2)`.
    - `L` (Turn Left): Direction changes to North (`N`).
    - `M` (Move North): Position becomes `(3, 3)`.
    - `M` (Move North): Position becomes `(3, 4)`.
    - `R` (Turn Right): Direction changes to East (`E`).
4. The final position and direction of the robot are `(3, 4) E`.

---

## Diagram

The following diagram illustrates the movement of the robot:

```
Initial Grid (5x5):
0 1 2 3 4 5
-------------
| . | . | . | . | . |
| . | . | . | . | . |
| . | . | . | . | . |
| . | . | . | . | . |
| . | . | . | . | . |
-------------
```

- Initial position of the robot: `(1, 0) N`
- The robot moves following the instructions.

```
Move 1 (M): (1, 0) -> (1, 1)
Move 2 (M): (1, 1) -> (1, 2)
Turn Right (R): Direction changes from N to E
Move 3 (M): (1, 2) -> (2, 2)
Move 4 (M): (2, 2) -> (3, 2)
Turn Left (L): Direction changes from E to N
Move 5 (M): (3, 2) -> (3, 3)
Move 6 (M): (3, 3) -> (3, 4)
Turn Right (R): Direction changes from N to E
```

Final position of the robot: `(3, 4) E`

---

## Conclusion

This program simulates the movement of robots on a 2D grid, processing commands that include turning and moving forward. It ensures that the robots stay within the grid boundaries and outputs their final positions and orientations after processing all instructions.
