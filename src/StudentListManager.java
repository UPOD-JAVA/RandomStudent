public class StudentListManager {

    public String[] removeStudentFromArray(String[] studentList, int index) {
        if (studentList != null && index >= 0 && index < studentList.length) {
            String[] newStudentList = new String[studentList.length - 1];
            int j = 0;

            for (int i = 0; i < newStudentList.length; ++i) {
                // TODO: Öğrenciyi kaldırmak için bu döngüyü tamamlayın

            }

            return newStudentList;
        } else {
            return studentList;
        }
    }

}
