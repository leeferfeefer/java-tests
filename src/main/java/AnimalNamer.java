public class AnimalNamer {

    public AnimalNamer () {}

    public String getName(Animal animal) {
        if (animal instanceof Dog) {
//            What if this sent a network request also
            return "FIDO";
        } else {
            return "dumb cat";
        }
    }
}
