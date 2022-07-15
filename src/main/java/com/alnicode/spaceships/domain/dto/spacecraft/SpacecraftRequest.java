package com.alnicode.spaceships.domain.dto.spacecraft;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * The {@code Spacecraft} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public abstract class SpacecraftRequest {

    private final double weight;
    private final String weightMeasure;
    private final int height;
    private final String heightMeasure;
    private final String mission;
    private final String fuel;
    private @Setter String state;
    private final long inventoryId;

}
