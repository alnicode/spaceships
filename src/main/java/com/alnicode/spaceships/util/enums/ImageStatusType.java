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
@Getter
public enum ImageStatusType {
    ACTIVE(1, "Active"),
    INACTIVE(2, "Inactive");

    private final int id;
    private final String name;
}
