import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public String[] readStudentListFromFile(String fileName) throws Exception {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("Dosya bulunamadı");
            } else {
                Scanner scanner = new Scanner(file);
                int numLines = 0;

                while (scanner.hasNextLine()) {
                    // TODO: Dosyanın kaç satır içerdiğini bulun

                }

                String[] studentList = new String[numLines];
                scanner = new Scanner(file);

                for (int i = 0; i < numLines; ++i) {
                    // TODO: Dosyadan öğrenci listesini okuyun
                }

                scanner.close();
                return studentList;
            }
        } catch (FileNotFoundException var7) {
            throw new Exception("Dosya bulunamadı");
        }
    }
}
