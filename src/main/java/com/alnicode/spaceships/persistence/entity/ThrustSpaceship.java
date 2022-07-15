package com.alnicode.spaceships.persistence.entity;

import com.alnicode.spaceships.constants.ThrustSpaceshipConstants;
import javax.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The thrust spaceship entity model.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 * @see com.alnicode.spaceships.persistence.entity.Spacecraft
 */
@NoArgsConstructor
@Getter
@Setter
public class ThrustSpaceship extends Spacecraft {

    @Column(nullable = false, length = ThrustSpaceshipConstants.THRUST_LENGTH)
    private String thrust;

}
