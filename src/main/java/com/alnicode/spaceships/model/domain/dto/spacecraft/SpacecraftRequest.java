package com.alnicode.spaceships.model.domain.dto.spacecraft;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The {@code Spacecraft} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@NoArgsConstructor
@Setter
@Getter
public abstract class SpacecraftRequest {

    private String name;
    private double weight;
    private String weightMeasure;
    private int height;
    private String heightMeasure;
    private String mission;
    private String fuel;
    private String state;
    private long inventoryId;

}
