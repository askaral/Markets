public enum Food {

    BREAD(2.3),
    MILK(1.40),
    CHEESE(3.2),
    SAUSAGE(3.65),
    BUTTER(3.60),
    SUNFLOWER_OIL(4.29),
    TOMATO(1.25),
    CUCUMBERS(1.15),
    MEAT(9.99),
    POTATOES(4.67),
    ONIONS(3.67),
    GARLIC(1.34),
    CABBAGE(1.55),
    NOODLES(2.29),
    EGGS(1.79),
    FLOUR(1.89);

    double price;

    Food(double price) {

        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


}
