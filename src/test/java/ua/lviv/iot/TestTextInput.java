package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestTextInput {

    TextInput textInput;
    
    @Test
    void findDateTest() {
        String input = "dhf fgh h h h ";
        textInput = new TextInput(input);
        textInput.findDate();
        assertEquals(2,textInput.getDate().size());
    }
}
