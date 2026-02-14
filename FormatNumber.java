import java.text.NumberFormat;

public class FormatNumber {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        String result = currency.format(83249283);
        String result2 = percent.format(0.1);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(NumberFormat.getCurrencyInstance().format(200));
    }
}
