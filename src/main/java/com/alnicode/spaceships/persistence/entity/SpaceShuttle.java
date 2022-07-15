package com.alnicode.spaceships.persistence.entity;

import com.alnicode.spaceships.constants.SpaceShuttleConstants;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The space shuttle entity abstract model.
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
@Table(name = "space_shuttles")
public class SpaceShuttle extends ThrustSpaceship {

    @Column(nullable = false, length = SpaceShuttleConstants.TRANSPORT_LENGTH)
    private String transport;

    @Column(length = SpaceShuttleConstants.POWER_LENGTH)
    private String power;

}
