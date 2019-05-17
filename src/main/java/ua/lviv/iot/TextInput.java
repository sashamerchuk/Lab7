package ua.lviv.iot;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextInput {
    List<String>  date = new ArrayList<>();
    private String input;
    private String dateOfPattern = "[^aeiouy\\s]{3}";
    
    public TextInput(String input) {
        this.input = input;
    }
    
    public void setInput(String input) {
        this.input = input;
    }

    public void setDate() {
        this.date=date;
    }
    
    public List<String> getDate() {
        return date;
    }
    
    public  List<String>  findDate(){
        Pattern pattern = Pattern.compile(dateOfPattern);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            date.add(matcher.group());
        }
        System.out.println(matcher.replaceAll("Sasha"));
        return date;
    }
    
    public void showResult() {
        System.out.println("I found");
        System.out.println(this.findDate());
    }
    
    public static String readInputText() {
        System.out.println("Enter the String \n");
        try(Scanner scanner = new Scanner(System.in)){
            return scanner.nextLine();
        }
    }
}
