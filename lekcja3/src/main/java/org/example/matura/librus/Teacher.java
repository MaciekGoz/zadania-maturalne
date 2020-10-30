package org.example.matura.librus;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.List;

import static org.example.matura.librus.Teacher.Position.TEACHER;

@Getter
@Setter
@SuperBuilder
public class Teacher extends User {
    enum Position {
        TEACHER, HEADMASTER, VICE_DIRECTOR
    }

    @Builder.Default
    private Position position = TEACHER;

    private TeacherSchedule schedule;
    private List<Subject> subjects;

}
