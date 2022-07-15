package com.alnicode.spaceships.persistence.entity;

import com.alnicode.spaceships.constants.ThrustSpaceshipConstants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
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
@Entity
@Table(name = "thrust_spaceships")
@PrimaryKeyJoinColumn(name = "thrust_spaceship_id")
public abstract class ThrustSpaceship extends Spacecraft {

    @Column(nullable = false, length = ThrustSpaceshipConstants.THRUST_LENGTH)
    private String thrust;

}
