package com.alnicode.spaceships.domain.dto.shuttle;

import com.alnicode.spaceships.domain.dto.thrust.ThrustSpaceshipRequest;
import lombok.Getter;

/**
 * The {@code SpaceShuttle} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class SpaceShuttleRequest extends ThrustSpaceshipRequest {

    private final int transport;
    private final String transportMeasure;
    private final String power;

    public SpaceShuttleRequest(final double weight, final String weightMeasure, final int height, final String heightMeasure,
                               final String mission, final String fuel, final String name, final double thrust, final String thrustMeasure,
                               final int transport, final String transportMeasure, final String power, final long inventoryId) {
        super(weight, weightMeasure, height, heightMeasure, mission, fuel, thrust, thrustMeasure, inventoryId, name);
        this.transport = transport;
        this.transportMeasure = transportMeasure;
        this.power = power;
    }

}
