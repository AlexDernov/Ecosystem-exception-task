import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void getByIdCHeck(){
        String id = "1";
        assertThrows(NoStudentWithId.class,
                () -> StudentRepo.findStudentById(id));
    }

}