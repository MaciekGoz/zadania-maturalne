package org.example.matura.librus;

import com.sun.webkit.dom.DOMWindowImpl;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Builder
public class Lesson {

    public static final int LESSON_DURATION = 45;

    @Builder.Default
    private List<Student> studentList = new ArrayList<>();

    private Teacher teacher;
    private Subject subject;
    private LocalDateTime localDateTime;
    private DayOfWeek dayOfWeek;

    @Builder.Default
    private int durationInMinutes = LESSON_DURATION;

    @Builder
    public Lesson(List<Student> studentList, Teacher teacher, Subject subject, LocalDateTime localDateTime,
                  DayOfWeek dayOfWeek, int durationInMinutes) {
        this.studentList = studentList;
        this.teacher = teacher;
        this.subject = subject;
        this.localDateTime = localDateTime;
        this.dayOfWeek = dayOfWeek;
        this.durationInMinutes = durationInMinutes;

        validateLocalDateTime();
    }

    private void validateLocalDateTime() {
        if (dayOfWeek != localDateTime.getDayOfWeek()) {
            throw new IllegalArgumentException("Given date was not on " + dayOfWeek.name());
        }
    }
}
