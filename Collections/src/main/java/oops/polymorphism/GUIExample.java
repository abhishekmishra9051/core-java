package oops.polymorphism;

// Common base class for all types of buttons
class Button {
    public void click() {
        System.out.println("Button clicked");
    }
}

// Subclass representing a regular button
class RegularButton extends Button {
    public void displayText() {
        System.out.println("Regular Button: Click to perform a standard action.");
    }
}

// Subclass representing a radio button
class RadioButton extends Button {
    public void select() {
        System.out.println("Radio Button: Select a single option.");
    }
}

// Subclass representing a checkbox
class CheckBox extends Button {
    public void toggle() {
        System.out.println("Checkbox: Toggle the selected state.");
    }
}

public class GUIExample {
    public static void main(String[] args) {
        Button button1 = new RegularButton();
        Button button2 = new RadioButton();
        Button button3 = new CheckBox();

        // Clicking each button and performing specific actions
        button1.click(); // Output: Button clicked
        ((RegularButton) button1).displayText();

        button2.click(); // Output: Button clicked
        ((RadioButton) button2).select();

        button3.click(); // Output: Button clicked
        ((CheckBox) button3).toggle();
    }
}

