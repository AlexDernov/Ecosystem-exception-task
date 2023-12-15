package StudentService;

import java.util.*;

public class StudentRepo {

    private static final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

   static public Student findStudentById(String id) throws NoStudentWithId {
        if (!students.containsKey(id)) {
            throw new NoStudentWithId("No such Student");
        }
        return students.get(id);
    }

}
