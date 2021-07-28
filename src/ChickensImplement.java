public class ChickensImplement implements CalculatorInterface {
    int x, y, z = 0; //loop counter

    @Override
    public void calculate(int money, int totalChickens, int a, int b, int c, int cocks, int hens, int chickens) {
        int k, overallBought, moneyUsed;

        x = getCounter(money, a, cocks);
        y = getCounter(money, b, hens);
        z = getCounter(money, c, chickens);
        
        //System.out.println(x + "\n" + y + "\n" + z);
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                k = totalChickens - i - j;
                overallBought = (i * cocks) + (j * hens) + k;
                moneyUsed = (i * a) + (j * b) + (k / chickens);
                if ((overallBought == totalChickens) && (k % chickens == 0) && (moneyUsed == money)) {
                    System.out.println("\nMoney: " + money + " yuan");
                    System.out.println("Total chickens to buy: " + totalChickens);
                    if (cocks * i != 0) { System.out.println("Cocks bought: " + (cocks * i) + " for " + (a * i) + " yuan"); }
                    if (hens * j != 0) { System.out.println("Hens bought: " + (hens * j) + " for " + (b * j) + " yuan"); }
                    if (k != 0) { System.out.println("Chickens bought: " + k + " for " + (k / chickens) + " yuan"); }
                    System.out.println("Overall chickens bought: " + overallBought);
                }
            }
        }
    }

    public int getCounter(int totalMoney, int yuan, int pieces) {
        int counter;

        counter = totalMoney / (yuan * pieces);
        return counter;
    }
}
