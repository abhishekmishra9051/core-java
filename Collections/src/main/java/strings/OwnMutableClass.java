package strings;

final class OwnMutableClass {

    private int i;

    OwnMutableClass(int i) {
        this.i = i;
    }

    public OwnMutableClass modify(int i) {
        if (this.i == i) { // Use == for reference equality
            return this;
        } else {
            return new OwnMutableClass(i);
        }
    }

    public static void main(String[] args) {
        OwnMutableClass ownMutableClass = new OwnMutableClass(10);
        OwnMutableClass ownMutableClass1 = new OwnMutableClass(100);
        OwnMutableClass ownMutableClass2 = new OwnMutableClass(10);

        System.out.println(ownMutableClass == ownMutableClass1); // Should be false
        System.out.println(ownMutableClass == ownMutableClass2); // Should be false

/*      The output is "false" for both comparisons because I haven't overridden the equals method in your custom class,
        and the default equals method checks for reference equality. Since ownMutableClass, ownMutableClass1,
        and ownMutableClass2 are separate instances, equals returns false for both comparisons. */

        System.out.println(ownMutableClass.equals(ownMutableClass1)); // false
        System.out.println(ownMutableClass.equals(ownMutableClass2)); // false
    }
}
