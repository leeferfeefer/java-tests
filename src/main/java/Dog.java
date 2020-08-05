public class Dog extends Animal {

    AnimalNamer animalNamer;

    public Dog(AnimalNamer animalNamer) {
        this.animalNamer = animalNamer;
    }

    public String bark() {
        return "BARK";
    }

    public int getLegs() {
        return 4;
    }

    public String getName() {
        String firstName = "George";
        String middleName = animalNamer.getName(this);
        if (middleName.equals("FIDO")) {
            middleName = "Rover";
        }
        String lastName = "Dog";
        return firstName + " " + middleName + " " + lastName;
    }
}