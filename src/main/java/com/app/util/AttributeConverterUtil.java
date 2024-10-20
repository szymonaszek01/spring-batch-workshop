package com.app.util;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AttributeConverterUtil {

    public static <A extends Enum<A>, C> C convertToDatabaseColumn(A entityEnumAttr, Supplier<C> dbValueSupplier) {
        if (entityEnumAttr == null) {
            return null;
        }
        return dbValueSupplier.get();
    }

    public static <A extends Enum<A>, C> A convertToEntityAttribute(C dbValue, Function<A, C> mapToDbValueFn, Class<A> enumClass) {
        if (dbValue == null) {
            return null;
        }
        return Stream.of(enumClass.getEnumConstants())
                .filter(c -> dbValue.equals(mapToDbValueFn.apply(c)))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
