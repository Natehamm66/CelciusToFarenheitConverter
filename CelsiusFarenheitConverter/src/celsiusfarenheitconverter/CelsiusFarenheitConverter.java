package celsiusfarenheitconverter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CelsiusFarenheitConverter {

    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        String option = null;
        function newFunction = new function();
        System.out.println("Type 1 for celcius to farenheit ot 2 for farenheit to celcius.");
        option = bR.readLine();
        do {
            System.out.println("What is your tempurture you wish to convert in celcius: ");
            option = bR.readLine();
            Double option1 = Double.parseDouble(option);
            newFunction.toFarenheit(option1);
            System.out.printf("You temperture is: " + newFunction.farenheit);

        } while (option.equals("1"));
        do {
            System.out.println("What is your tempurture you wish to convert in farenheit: ");
            option = bR.readLine();
            Double option1 = Double.parseDouble(option);
            newFunction.toCelcius(option1);
            System.out.printf("You temperture is: " + newFunction.celcius);



        } while (option.equals("2"));


    }
}
