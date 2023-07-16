import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader();
        StudentListManager studentListManager = new StudentListManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç öğrenci seçmek istiyorsunuz?");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        String[] studentList = fileReader.readStudentListFromFile("/Users/ahmetgltkn/Desktop/upod-lab/RandomStudent/src/students.txt");
        if (studentList != null && studentList.length != 0) {
            Random random = new Random();
            System.out.println("Seçilen " + numStudents + " öğrenci:");

            for (int i = 0; i < numStudents; ++i) {
                int index = random.nextInt(studentList.length);
                String randomStudent = studentList[index];
                Gender gender = getGenderByLastCharacter(randomStudent);
                randomStudent = randomStudent.substring(0, randomStudent.length() - 2);
                System.out.println(i + 1 + "-" + randomStudent + " " + gender.getPostfix());
                studentList = studentListManager.removeStudentFromArray(studentList, index);
            }

        } else {
            System.out.println("Öğrenci Listesi Boş");
        }
    }

    private static Gender getGenderByLastCharacter(String studentName) {
        char lastCharacter = studentName.charAt(studentName.length() - 1);
        return Character.toLowerCase(lastCharacter) == 'e' ? Gender.MALE : Gender.FEMALE;
    }
}
