import java.io.File;
import java.io.IOException;

@FunctionalInterface
public interface Writeable {
    void write(File file, User[] users) throws IOException;
}
