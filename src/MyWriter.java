import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter implements Writeable {
    @Override
    public void write(File file, User[] users) throws IOException {

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (User user :
                users) {
            bufferedWriter.write(user.ID + "\\|" + user.name);
            for (int counter :
                    user.counters) {
                bufferedWriter.write("\\|" + counter);
            }
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}