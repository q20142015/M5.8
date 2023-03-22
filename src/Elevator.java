public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = (currentFloor > minFloor) ? (currentFloor - 1) : currentFloor;
    }

    public void moveUp() {
        currentFloor = (currentFloor < maxFloor) ? (currentFloor + 1) : currentFloor;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Oshibka");
            return;
        }
        if (floor == currentFloor) {
            System.out.println("Ti daun?");
            return;
        }
        if (floor > currentFloor) {
            do {
                moveUp();
                System.out.println(currentFloor);
            } while (floor > currentFloor);
        } else if (floor < currentFloor) {
            do {
                moveDown();
                System.out.println(currentFloor);
            } while (floor < currentFloor);

        }
    }
}
