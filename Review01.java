
public class Review01 {

    public static void main(String[] args) {

        /* 価格を2500円に設定 */
        int price = 2500;
        /* 税率を10%に設定 */
        int taxRate = 8;
        int salesTax = tax(price, taxRate);
        int payment = price + salesTax;

        System.out.println(price + "円の商品の税込価格は" + payment + "円（消費税は" + salesTax + "円）です。");
    }

    public static int tax(double price, double taxRate) {
        double tax = price * (taxRate / 100);
        int salesTax = (int) Math.round(tax);
        return salesTax;
    }

}
