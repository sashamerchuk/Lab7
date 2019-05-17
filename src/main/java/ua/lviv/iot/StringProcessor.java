package ua.lviv.iot;

public class StringProcessor {
    
    public static void main(String[] args) {

        String input = TextInput.readInputText();
        TextInput text = new TextInput(input);
        text.showResult();

    }

}
