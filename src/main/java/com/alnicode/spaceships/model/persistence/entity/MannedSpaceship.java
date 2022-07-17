package com.alnicode.spaceships.model.persistence.entity;

import com.alnicode.spaceships.util.constants.MannedSpaceshipConstants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The manned spaceship entity model.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 * @see Spacecraft
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "manned_spaceships")
@PrimaryKeyJoinColumn(name = "manned_spaceship_id")
public class MannedSpaceship extends Spacecraft {

    @Column(name = "earth_orbit", nullable = false, length = MannedSpaceshipConstants.EARTH_ORBIT_LENGTH)
    private String earthOrbit;

    @Column(name = "people_capacity", nullable = false, length = MannedSpaceshipConstants.PEOPLE_CAPACITY)
    private String peopleCapacity;

}
