package org.example.matura.librus;

import java.time.LocalDateTime;

import static java.time.DayOfWeek.MONDAY;
import static org.example.matura.librus.Mark.Value.GOOD;
import static org.example.matura.librus.Subject.MATHEMATICS;
import static org.example.matura.librus.Subject.PHYSICS;
import static org.example.matura.librus.Teacher.Position.HEADMASTER;
import static org.example.matura.librus.utils.ArrayUtils.listOf;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("Jan")
                .surname("Kowalski")
                .emailAddress("jan@kowal.ski")
                .build();

        System.out.println(student.getMarksList());

        Teacher teacher = Teacher.builder()
                .name("Adam").surname("Kowalski")
                .subjects(listOf(MATHEMATICS, PHYSICS))
                .position(HEADMASTER)
                .build();

        Mark mark = Mark.builder()
                .subject(MATHEMATICS)
                .student(student)
                .teacher(teacher)
                .value(GOOD)
                .build();

        Lesson lesson = Lesson.builder()
                .dayOfWeek(MONDAY)
                .localDateTime(LocalDateTime.of(2020, 10, 26, 10, 0))
                .build();
    }
}
