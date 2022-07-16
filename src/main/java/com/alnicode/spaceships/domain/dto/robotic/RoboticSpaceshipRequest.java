package com.alnicode.spaceships.domain.dto.robotic;

import com.alnicode.spaceships.domain.dto.thrust.ThrustSpaceshipRequest;
import com.alnicode.spaceships.util.enums.ImageStatusType;
import com.alnicode.spaceships.util.enums.StateType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The {@code RoboticSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@NoArgsConstructor
@Getter
@Setter
public class RoboticSpaceshipRequest extends ThrustSpaceshipRequest implements Image, Landing {

    private double speed;
    private String speedMeasure;
    private String destinyOrbit;
    private boolean imageStatus;

    @Override
    public void sendImages() {
        if (getState().equals(StateType.LANDED.getName())) {
            imageStatus = ImageStatusType.ACTIVE.state();
        }
    }

    @Override
    public void touchDown() {
        setState(StateType.LANDED.getName());
    }

}
