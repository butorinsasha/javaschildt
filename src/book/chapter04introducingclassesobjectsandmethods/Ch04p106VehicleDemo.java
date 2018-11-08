package book.chapter04introducingclassesobjectsandmethods;

// Checking weather it is possible to create to classes in one source .java file? - Yes, but only one can be private named after source .java file.
class Ch04p106VehicleDemo {
    public static void main(String[] args) {
        Ch04p106Vehicle minivan = new Ch04p106Vehicle();
        int range;

        // assign value to friends in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // compute the range assuming a full tank of gass
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
    }
}

class Ch04p106Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}
