import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Client>clients = new ArrayList<>();
        clients.add(new Client("Askar","Almazbekov","Rewe",
                       List.of(Food.BREAD,Food.BUTTER,Food.EGGS,Food.CUCUMBERS,Food.CABBAGE)));
        clients.add(new Client("Askar", "Almazbekov", "Aldi",
                       List.of(Food.CHEESE,Food.SAUSAGE,Food.GARLIC,Food.MEAT,Food.FLOUR,Food.POTATOES)));
        clients.add(new Client("Askar","Almazbekov","Lidl",
                        List.of(Food.MILK,Food.NOODLES,Food.ONIONS,Food.SUNFLOWER_OIL,Food.TOMATO)));

        Service service = new Service();
        service.shoppingList();
        System.out.println("________________________________");
        service.marketsList(clients);
        service.receipt1(clients);
        System.out.println();
        service.receipt2(clients);
        System.out.println();
        service.receipt3(clients);
        System.out.println();
        service.totalAccount(clients);

    }
}