package book.chapter02introducingdatatypesandoperators;

public class WallEcho {
    public static void main(String[] args) {
        double t = 2.0;
        double soundSpeed = 343; // in meters
        double dist = t / 2 * soundSpeed;
        System.out.println("Distance to the wall is " + dist + " meters");
    }
}
