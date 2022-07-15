package com.alnicode.spaceships.persistence.entity;

import com.alnicode.spaceships.constants.RoboticSpaceshipConstants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The robotic spaceship entity model.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 * @see com.alnicode.spaceships.persistence.entity.ThrustSpaceship
 * @see com.alnicode.spaceships.persistence.entity.Spacecraft
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "robotic_spaceships")
@PrimaryKeyJoinColumn(name = "robotic_spaceship_id")
public class RoboticSpaceship extends ThrustSpaceship {

    @Column(nullable = false, length = RoboticSpaceshipConstants.SPEED_LENGTH)
    private String speed;

    @Column(nullable = false, length = RoboticSpaceshipConstants.DESTINY_ORBIT_LENGTH, name = "destiny_orbit")
    private String destinyOrbit;

}
