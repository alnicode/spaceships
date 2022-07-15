package com.alnicode.spaceships.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The state types.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum StateType {
    DESTROYED(1, "Destroyed"),
    INACTIVE(2, "Inactive"),
    ORBIT(3, "In orbit"),
    LANDED(4, "Landed");

    private final int id;
    private final String name;
}
