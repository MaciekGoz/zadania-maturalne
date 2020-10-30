package org.example.matura.librus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
public abstract class User {
    private String name;
    private String surname;
    private String login;
    private String password;
    private String emailAddress;
    private LocalDate dateOfBirth;
}
