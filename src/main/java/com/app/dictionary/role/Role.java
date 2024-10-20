package com.app.dictionary.role;

import lombok.Getter;

@Getter
public enum Role {

    DOCTOR("D"),
    PATIENT("P");

    private final String code;

    Role(String code) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Role code cannot be blank");
        }
        this.code = code;
    }
}
