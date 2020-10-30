package org.example.matura.librus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import static org.example.matura.librus.Mark.Value.GOOD;

@Getter
@Setter
@Builder
public class Mark {

    @AllArgsConstructor
    enum Value {
        INSUFFICIENT(1), ADMISSIBLE(2), SUFFICIENT(3), GOOD(4), VERY_GOOD(5), EXCELLENT(6);

        @Getter
        private int value;
    }

    @Builder.Default
    private Value value = GOOD;

    private Subject subject;
    private Student student;
    private Teacher teacher;
    private LocalDate date;
}
