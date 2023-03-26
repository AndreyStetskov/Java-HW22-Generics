import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        DataBaseWriter<String> cat = new DataBaseWriter<>("Siamese cat", "Balinese cat");
        DataBaseWriter<Double> mathematicalConstant = new DataBaseWriter<>("Feigenbaum constants", 4.669201609102990671853203820466);
        DataBaseWriter<Boolean> isIntruder = new DataBaseWriter<>("Theft", false);
        DataBaseWriter<Integer> number = new DataBaseWriter<>("Prime integer", 11);
        DataBaseWriter<BigDecimal> cryptoCurrency = new DataBaseWriter<>("BSVDpi price", new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"));

        cat.save();
        mathematicalConstant.save();
        isIntruder.save();
        number.save();
        cryptoCurrency.save();
    }
}