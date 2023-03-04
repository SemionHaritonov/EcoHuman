public class User {
    public int ID;
    public String name;
    public int[] counters;
    public String[] countersNames;
    public boolean isEco;

    public User(int ID, String name, int[] counters, String[] countersNames, boolean isEco) {
        this.ID = ID;
        this.name = name;
        this.counters = counters;
        this.isEco = isEco;
    }

    public User(User user) {
        this.ID = user.ID;;
        this.name = user.name;
        this.counters = user.counters.clone();
        this.countersNames = user.countersNames;
        this.isEco = user.isEco;
    }


}
