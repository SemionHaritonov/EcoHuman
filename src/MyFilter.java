import java.util.ArrayList;

public class MyFilter implements Filterable {
    public int ecoValue;

    public MyFilter(int ecoValue) {
        this.ecoValue = ecoValue;
    }

    @Override
    public User[] filter(User[] unsortedUsers) {

        int eco = 0;

        for (User user :
                unsortedUsers) {

            for (int counter :
                    user.counters) {
                if (counter > ecoValue) {
                    user.isEco = false;
                }
            }

            if (user.isEco) {
                eco++;
            }
        }

        User[] sortedUsers = new User[eco];

        int counter = 0;
        for (User user :
                unsortedUsers) {
            if (user.isEco) {
                sortedUsers[counter] = new User(user);
                counter++;
            }

        }

        return sortedUsers;
    }
}
