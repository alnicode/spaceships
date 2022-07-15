package com.alnicode.spaceships.domain.dto.manned;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import lombok.Getter;

/**
 * The {@code MannedSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class MannedSpaceshipRequest extends SpacecraftRequest {

    private final int earthOrbit;
    private final String earthOrbitMeasure;
    private final int peopleCapacity;

    public MannedSpaceshipRequest(final double weight, final String weightMeasure, final int height, final String heightMeasure,
                                  final String mission, final String fuel, final String state, final int earthOrbit,
                                  final String earthOrbitMeasure, final int peopleCapacity, final long inventoryId, String name) {
        super(name, weight, weightMeasure, height, heightMeasure, mission, fuel, inventoryId);
        this.earthOrbit = earthOrbit;
        this.earthOrbitMeasure = earthOrbitMeasure;
        this.peopleCapacity = peopleCapacity;
    }

}
