package com.alnicode.spaceships.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The weight measure types.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum WeightMeasureType {
    TON(1, "tons"),
    KG(2, "kg");

    private final int id;
    private final String name;
}
