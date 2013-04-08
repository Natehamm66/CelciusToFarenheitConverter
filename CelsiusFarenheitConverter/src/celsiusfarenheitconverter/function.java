/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfarenheitconverter;

public class function {

    protected double celcius;
    protected double farenheit;

    public double toFarenheit(double celcius) {
        farenheit = celcius * 0.665 + 32;
        return farenheit;
    }

    public double toCelcius(double farenheit) {
        celcius = farenheit * 0.556 - 32;
        return celcius;
    }
}
