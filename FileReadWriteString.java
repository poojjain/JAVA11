import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWriteString {

    public static void main(String[] args) throws IOException {
        FileReadWriteString fileReadWriteString = new FileReadWriteString();
        fileReadWriteString.fileReadWrite();
    }

    private void fileReadWrite() throws IOException {
        /* java 11 method
    	Path filePath = Files.writeString(Files.createTempFile(Path.of("F:/java11/src/file/methods"), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
        */
    }

}
