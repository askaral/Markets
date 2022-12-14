import java.util.List;

public class Client {

    private String firstName;
    private String lastName;

    private String marketsName;
    private List<Food>foods;

    public Client(String firstName, String lastName, String marketsName, List<Food>foods) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marketsName = marketsName;
        this.foods = foods;
    }
    public Client(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public void setMarketsName (String marketsName){
            this.marketsName = marketsName;
        }
        public String getMarketsName () {
            return marketsName;
        }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}