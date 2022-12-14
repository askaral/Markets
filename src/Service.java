import java.util.ArrayList;
import java.util.List;

public class Service extends Client implements Shopable {
    final double purse = 50.00;

    public double getPurse() {
        return purse;
    }

    public Service(String firstName, String lastName, String marketsName, List<Food> foods) {
        super(firstName, lastName, marketsName, foods);
    }
    public Service() {

    }
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void shoppingList() {
        System.out.println(" *** Your shopping list *** ");
        Food[] foods = Food.values();
        for (Food f : foods) {
            System.out.println(f);
        }
    }
    @Override
    public void marketsList(List<Client> clients) {
        System.out.println("** List of shops where you should buy groceries **");
        for (Client c : clients) {
            System.out.println(c.getMarketsName());

        }
    }
    @Override
    public void receipt1(List<Client> clients) {
        for (Client r1 : clients) {
            if (r1.getMarketsName().contains("Aldi")) {
                System.out.println("************** RECEIPT *************\n" +
                        "Name of client: " + r1.getFirstName() + " " + r1.getLastName() +
                        "\nName of market: " + r1.getMarketsName() +
                        "\nList of foods: " + r1.getFoods());
                      System.out.println("Total: "+(float)sum(clients)+" EUR");
                      System.out.println("Discount: 5% ");
                      System.out.println("Amount after discount: "+(float)discount(clients)+" EUR");
                System.out.println("Paid: 50.00 EUR");
                System.out.println("Change: "+(float)myAccount(clients)+" EUR");
                System.out.println("**** Thank you for your purchase ****");

            }
        }
    }
    @Override
    public void receipt2(List<Client>clients) {
        for (Client r2:clients) {
            if (r2.getMarketsName().contains("Rewe")){
                System.out.println("~~~~~~~~~~~~~~~ RECEIPT ~~~~~~~~~~~~~~");
                System.out.println("Name of client: " + r2.getFirstName() + " " + r2.getLastName());
                System.out.println("Name of market: " + r2.getMarketsName());
                System.out.println("List of foods: " + r2.getFoods());
                System.out.println("Total: "+(float)sum1(clients)+" EUR");
                System.out.println("Discount: no discounts today ");
                System.out.println("Amount after discount: "+(float)sum1(clients)+" EUR");
                System.out.println("Paid: "+(float)myAccount(clients)+" EUR");
                System.out.println("Change: "+(int)myAccount1(clients)+" EUR");
                System.out.println("~~~~ Thank you for your purchase ~~~~");
            }
        }
    }

    @Override
    public void receipt3(List<Client>clients) {
        for (Client r3:clients) {
            if (r3.getMarketsName().contains("Lidl")){
                System.out.println("--------------- RECEIPT ---------------");
                System.out.println("Name of client: " + r3.getFirstName() + " " + r3.getLastName());
                System.out.println("Name of market: " + r3.getMarketsName());
                System.out.println("List of foods: " + r3.getFoods());
                System.out.println("Total: "+(float)sum2(clients)+" EUR");
                System.out.println("Discount: 3% ");
                System.out.println("Amount after discount: "+(float)discount1(clients)+" EUR");
                System.out.println("Paid: "+(int)myAccount1(clients)+" EUR");
                System.out.println("Change: "+(float)myAccount2(clients)+" EUR");
                System.out.println("---- Thank you for your purchase ----");

            }
        }
    }
    public double sum(List<Client> clients) {
        double sum = 0;
        for (Client s : clients) {
            if (s.getMarketsName().equals("Aldi")) {
                for (Food f : s.getFoods()) {
                    sum += f.getPrice();
                }
            }
        }
        return sum;

    }
    private double sum1(List<Client>clients){
        double sum1 = 0;
        for (Client s1:clients) {
            if(s1.getMarketsName().equals("Rewe")){
                for (Food f1:s1.getFoods()) {
                    sum1+= f1.getPrice();
                }
            }
        }
        return sum1;
    }
    private double sum2(List<Client>clients) {
        double sum2 = 0;
        for (Client s1 : clients) {
            if (s1.getMarketsName().equals("Lidl")) {
                for (Food f1 : s1.getFoods()) {
                    sum2 += f1.getPrice();
                }
            }
        }
        return sum2;
    }
    public double discount(List<Client>clients){
        double  d = 5;
        double dsum = 0;
        double isum = 0;
        double ds = 0;
        dsum=(float)sum(clients)*d;
        isum=dsum/100;
        ds=(float)sum(clients)-isum;
        return ds;
    }
    public double discount1(List<Client>clients){
        double  d1 = 3;
        double dsum1 = 0;
        double isum1 = 0;
        double ds1 = 0;
        dsum1=(float)sum2(clients)*d1;
        isum1=dsum1/100;
        ds1=(float)sum2(clients)-isum1;
        return ds1;
    }
    public double myAccount(List<Client>clients){
        double sdacha = 0;
        sdacha=getPurse()-(float)discount(clients);
        return sdacha;
    }
    private double myAccount1(List<Client>clients){
        double eur1 = 0;
        eur1=(float)myAccount(clients)-(float)sum1(clients);
        return eur1;
    }
    private double myAccount2(List<Client>clients){
        double eur2 = 0;
        eur2=(float)myAccount1(clients)-(float)sum2(clients);
        return eur2;
    }
    public void totalAccount(List<Client>clients){
        System.out.println("Profit Aldi: "+(float)discount(clients)+" EUR");
        System.out.println("Profit Rewe: "+(float)sum1(clients)+" EUR");
        System.out.println("Profit Lidl: "+(float)discount1(clients)+" EUR");
        System.out.println("My balance before shopping: "+getPurse()+" EUR");
        System.out.println("My balance after shopping: "+(int)myAccount2(clients)+" EUR");

    }
}
