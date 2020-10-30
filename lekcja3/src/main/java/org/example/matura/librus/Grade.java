package org.example.matura.librus;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Grade {
    private String name;
    @Builder.Default
    private List<Student> studentsList = new ArrayList<>();

    @Builder.Default
    List<Teacher> tutorList = new ArrayList<>();

    @Builder.Default
    List<Student> classPresidentList = new ArrayList<>();
}
