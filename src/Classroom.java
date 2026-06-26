import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Classroom {
    private final List<Student> studentList;

    public Classroom(){
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Optional<Student> findById(int id){
        return studentList.stream()
                .filter(student -> student.getId() == id).findFirst();
    }

    public List<Student> getPassedStudents(){
        return studentList.stream()
                .filter(student -> student.getPassStatus().equals(PassStatus.PASSED.getLabel())).toList();

    }

    public Optional<Student> findTopStudent(){
        return studentList.stream()
                .max(Comparator.comparingInt(Student::getScore));
    }

    public List<Student> searchByName(String keyWord){
        return studentList.stream()
                .filter(student -> student.getName().contains(keyWord)).toList();
    }

}
