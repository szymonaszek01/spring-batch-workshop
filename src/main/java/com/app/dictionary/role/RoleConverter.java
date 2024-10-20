package com.app.dictionary.role;

import com.app.util.AttributeConverterUtil;
import jakarta.persistence.AttributeConverter;

public class RoleConverter implements AttributeConverter<Role, String> {
    @Override
    public String convertToDatabaseColumn(Role role) {
        return AttributeConverterUtil.convertToDatabaseColumn(role, role::getCode);
    }

    @Override
    public Role convertToEntityAttribute(String s) {
        return AttributeConverterUtil.convertToEntityAttribute(s, Role::getCode, Role.class);
    }
}
