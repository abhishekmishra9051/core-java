package strings;

class CustomStringBuilder {
    private StringBuilder stringBuilder = new StringBuilder();

    public CustomStringBuilder appendHello() {
        stringBuilder.append("Hello");
        return this;
    }

    public CustomStringBuilder appendComma() {
        stringBuilder.append(", ");
        return this;
    }

    public CustomStringBuilder appendWorld() {
        stringBuilder.append("World");
        return this;
    }

    public CustomStringBuilder appendExclamation() {
        stringBuilder.append("!");
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}

public class ChainingExample {
    public static void main(String[] args) {
        String result = new CustomStringBuilder()
                .appendHello()
                .appendComma()
                .appendWorld()
                .appendExclamation()
                .toString();

        System.out.println(result);
    }
}
