package com.alnicode.spaceships.domain.dto.shuttle;

import com.alnicode.spaceships.domain.dto.thrust.ThrustSpaceshipResponse;
import lombok.Getter;

/**
 * The {@code SpaceShuttle} response model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class SpaceShuttleResponse extends ThrustSpaceshipResponse {

    private final String transport;
    private final String power;

    public SpaceShuttleResponse(final long id, final String weight, final String height, final String mission, final String fuel,
                                final String state, final String thrust, final String transport, final String power) {
        super(id, weight, height, mission, fuel, state, thrust);
        this.transport = transport;
        this.power = power;
    }

}
