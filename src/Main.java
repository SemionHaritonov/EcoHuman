import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("D:\\Java\\IdeaProjects\\Module 5\\EcoHuman\\data.csv")
                .getAbsoluteFile();
        File outputFile = new File("D:\\Java\\IdeaProjects\\Module 5\\EcoHuman\\EcoUsers.csv")
                .getAbsoluteFile();

        Readable readable = new MyReader();
        Filterable filterable = new MyFilter(200);
        Writeable writeable = new MyWriter();

        try {
            User[] unsortedUsers = readable.read(inputFile);
            User[] sortedUsers = filterable.filter(unsortedUsers);
            writeable.write(outputFile, sortedUsers);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}