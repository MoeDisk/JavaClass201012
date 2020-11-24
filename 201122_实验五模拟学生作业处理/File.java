package five;
import java.io.*;

public class FileUtil {
    public static String getFileName(String path) {
        return new File(path).getName();
    }
    public static boolean exists(String path) {
        return new File(path).exists();
    }
    public static synchronized boolean touch(String path) {
        File f = new File(path);
        if (f.exists()) {
            return false;
        }
        try {
            f.createNewFile();
            return true;
        } catch (IOException ignored) {
            return false;
        }
    }
    public static boolean remove(String path) {
        return new File(path).delete();
    }
    public static void recreate(String path) {
        remove(path);
        touch(path);
    }
    public static synchronized String readFile(String path) throws IOException {
        File f = new File(path);
        StringBuilder contents = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line;
            boolean firstLine = true;
            while ((line = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                } else {
                    contents.append("\n");
                }
                contents.append(line);
            }
        }
        return contents.toString();
    }
    public static synchronized boolean writeFile(String path, String[] lines) {
        touch(path);
        try (PrintStream ps = new PrintStream(path)) {
            for (String line : lines) {
                ps.println(line);
            }
        } catch (FileNotFoundException ignored) {
        }
        return true;
    }
}
