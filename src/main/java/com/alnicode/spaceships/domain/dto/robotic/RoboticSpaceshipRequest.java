package com.alnicode.spaceships.domain.dto.robotic;

import com.alnicode.spaceships.domain.dto.thrust.ThrustSpaceshipRequest;
import com.alnicode.spaceships.util.enums.StateType;
import lombok.Getter;

/**
 * The {@code RoboticSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class RoboticSpaceshipRequest extends ThrustSpaceshipRequest implements Image, Landing {

    private final double speed;
    private final String speedMeasure;
    private final String destinyOrbit;

    public RoboticSpaceshipRequest(final double weight, final String weightMeasure, final int height,
                                   final String heightMeasure, final String mission, final String fuel, final double thrust,
                                   final String thrustMeasure, final double speed, final String speedMeasure,
                                   final String destinyOrbit, final long inventoryId, final String name) {
        super(weight, weightMeasure, height, heightMeasure, mission, fuel, thrust, thrustMeasure, inventoryId, name);
        this.speed = speed;
        this.speedMeasure = speedMeasure;
        this.destinyOrbit = destinyOrbit;
    }

    @Override
    public void sendImages() {
    }

    @Override
    public void touchDown() {
        setState(StateType.LANDED.getName());
    }

}
