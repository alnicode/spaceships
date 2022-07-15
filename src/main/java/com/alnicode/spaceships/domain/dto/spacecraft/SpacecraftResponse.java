package com.alnicode.spaceships.domain.dto.spacecraft;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The {@code Spacecraft} response model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public abstract class SpacecraftResponse {

    private final long id;
    private final String weight;
    private final String height;
    private final String heightMeasure;
    private final String mission;
    private final String fuel;
    private final String state;

}
