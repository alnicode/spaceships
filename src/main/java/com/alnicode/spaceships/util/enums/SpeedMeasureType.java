package com.alnicode.spaceships.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The speed measure type.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum SpeedMeasureType {
    KMH(1, "km/h"),
    MKS(2, "km/s");

    private final int id;
    private final String name;
}
