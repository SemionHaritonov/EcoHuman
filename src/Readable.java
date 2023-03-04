import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@FunctionalInterface
public interface Readable {
    User[] read(File file) throws IOException;
}
