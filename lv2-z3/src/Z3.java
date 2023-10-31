import java.util.List;
public class Z3{
    public static Double min (List<Double> brojevi) {
        double min = Double.MAX_VALUE;
        for (double broj : brojevi) {
            if (broj < min) {
                min = broj;
            }
        }
        return min;
    }

    public static Double max (List<Double> brojevi1){
        double max = Double.MIN_VALUE;
        for (double broj1 : brojevi1){
            if (broj1 > max) {
                max = broj1;
            }
        }
        return max;
    }

    public static Double mean (List<Double> brojevi2){
        double suma = 0;
        for (double broj2 : brojevi2){
            suma += broj2;
        }
        return suma/brojevi2.size();
    }

    public static Double standardnaDevijacija (List<Double> brojevi3){
        Double mean = Z3.mean(brojevi3);
        float StandardnaDevijacija = 0;
        for (Double broj3 : brojevi3){
            StandardnaDevijacija += Math.pow(broj3 - mean, 2);
        }
        return Math.sqrt(StandardnaDevijacija / brojevi3.size());
    }
}