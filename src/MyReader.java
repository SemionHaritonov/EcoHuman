import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyReader implements Readable{
    @Override
    public User[] read(File file) throws IOException {

        List<String> fileStream = Files.readAllLines(file.toPath());
        User[] users = new User[fileStream.size() - 1];

        String[] names = fileStream.get(0).split("\\|");

        for (int counter = 1; counter < fileStream.size(); counter++) {



            String[] userString = fileStream.get(counter).split("\\|");

            int[] in = new int[userString.length - 2];


            for (int counterValues = 2; counterValues < userString.length; counterValues++) {
                in[counterValues - 2] = Integer.parseInt(userString[counterValues]);
            }

            users[counter - 1] = new User(
                    Integer.parseInt(userString[0]),
                    userString[1],
                    in,
                    names,
                    true);

        }

        return users;
    }

/*    public static void main(String[] args) throws IOException {
        File inputFile = new File("D:\\Java\\IdeaProjects\\Module 5\\EcoHuman\\data.csv")
                .getAbsoluteFile();
        Readable readable = new MyReader();
        User[] u = readable.read(inputFile);
        System.out.println();
    }*/


}
