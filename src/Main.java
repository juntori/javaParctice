import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public Main(){
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run(){
        Classroom classroom = new Classroom();

        classroom.addStudent(new Student(1,"김하나", 87));
        classroom.addStudent(new Student(2, "이도윤", 92));
        classroom.addStudent(new Student(3, "박서준", 58));
        classroom.addStudent(new Student(4, "정다은", 75));


        System.out.println("----------전체 학생 출력----------");
        for(Student student : classroom.getStudentList()){
            System.out.println(student);
        }

        System.out.println("----------id로 찾아 점수 수정----------");
        System.out.println("수정할 학생의 id를 입력하세요.");
        int id = scanner.nextInt();

        System.out.println("새 점수를 입력하세요.");
        int score = scanner.nextInt();

        Optional<Student> findStudent = classroom.findById(id);
        if (findStudent.isEmpty()){
            System.out.println("없는 학생입니다.");
            return;
        }
        findStudent.get().updateScore(score);

        System.out.println("----------합격자 목록 출력----------");
        for(Student student : classroom.getPassedStudents()){
            System.out.println(student);
        }

        System.out.println("----------최고점 학생 출력----------");
        System.out.println(classroom.findTopStudent());

        System.out.println("----------이름으로 학생 검색----------");
        System.out.println("찾을 학생의 이름을 입력하세요.");
        String keyword = scanner.next();
        System.out.println(classroom.searchByName(keyword));




    }
}
