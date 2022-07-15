package com.alnicode.spaceships.domain.dto.thrust;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import lombok.Getter;

/**
 * The {@code ThrustSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class ThrustSpaceshipRequest extends SpacecraftRequest {

    private final double thrust;
    private final String thrustMeasure;

    public ThrustSpaceshipRequest(final double weight, final String weightMeasure, final int height, final String heightMeasure,
                                  final String mission, final String fuel, final String state, final double thrust, final String thrustMeasure) {
        super(weight, weightMeasure, height, heightMeasure, mission, fuel, state);
        this.thrust = thrust;
        this.thrustMeasure = thrustMeasure;
    }

}
