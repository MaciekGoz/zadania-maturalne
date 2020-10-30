package org.example.matura.librus;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public class Student extends User {
    // TODO: 30.10.2020 uzupelnic
    enum Extension{
        MATHEMATICS, POLISH, ENGLISH, PHYSICS
    }

    private StudentSchedule schedule;
    private Grade grade;

    @Builder.Default
    private List<Mark> marksList = new ArrayList<>();

    @Builder.Default
    private List<Extension> extensionList = new ArrayList<>();
}
