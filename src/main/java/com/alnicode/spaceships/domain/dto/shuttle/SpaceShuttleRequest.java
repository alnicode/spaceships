package com.alnicode.spaceships.domain.dto.shuttle;

import com.alnicode.spaceships.domain.dto.thrust.ThrustSpaceshipRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The {@code SpaceShuttle} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@NoArgsConstructor
@Setter
@Getter
public class SpaceShuttleRequest extends ThrustSpaceshipRequest {

    private int transport;
    private String transportMeasure;
    private String power;

}
