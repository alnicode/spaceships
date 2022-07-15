package com.alnicode.spaceships.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The image status types.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
public enum ImageStatusType {
    ACTIVE(1, true),
    INACTIVE(2, false);

    private final @Getter int id;
    private final boolean state;

    public boolean state() {
        return state;
    }
}
